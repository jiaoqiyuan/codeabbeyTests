package com.xzg.ratelimiter.alg;


import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Stopwatch;
import jdk.nashorn.internal.runtime.regexp.joni.exception.InternalException;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RateLimitAlg {
    private static final long TRY_LOCK_TIMEOUT = 200L; // 200ms
    private Stopwatch stopwatch;
    private AtomicInteger currentCount = new AtomicInteger(0);
    private final int limit;
    private Lock lock = new ReentrantLock();

    public RateLimitAlg(int limit) {
        this(limit, Stopwatch.createStarted());
    }

    @VisibleForTesting
    protected RateLimitAlg(int limit, Stopwatch stopwatch) {
        this.limit = limit;
        this.stopwatch = stopwatch;
    }

    public boolean tryAcquire() {
        int updateCount = currentCount.incrementAndGet();
        if (updateCount <= limit) {
            return true;
        }

        try {
            if (lock.tryLock(TRY_LOCK_TIMEOUT, TimeUnit.MILLISECONDS)) {
                try {
                    if (stopwatch.elapsed(TimeUnit.MILLISECONDS) > TimeUnit.SECONDS.toMillis(1)) {
                        currentCount.set(0);
                        stopwatch.reset();
                    }
                    updateCount = currentCount.incrementAndGet();
                    return updateCount <= limit;
                } finally {
                    lock.unlock();
                }
            } else {
                throw new InternalException("tryAcquire() wait lock too long:" + TRY_LOCK_TIMEOUT + "ms");
            }
        } catch (InterruptedException e) {
            throw new InternalError("tryAcquire() is interrupted by lock-time-out.", e);
        }
    }
}
