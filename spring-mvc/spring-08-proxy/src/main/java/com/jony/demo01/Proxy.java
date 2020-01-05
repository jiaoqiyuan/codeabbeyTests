package com.jony.demo01;

//代理
public class Proxy implements Rent {
    private Host host;

    public Proxy(){
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "Proxy{" +
                "host=" + host +
                '}';
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        signPaper();
        charge();
    }

    public void seeHouse() {
        System.out.println("中介看房！");
    }

    public void signPaper() {
        System.out.println("中介签合同！");
    }

    public void charge() {
        System.out.println("收中介费!");
    }
}
