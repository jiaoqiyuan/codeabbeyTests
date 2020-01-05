package com.jony.demo03;


public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        invocationHandler.setRent(host);
        Rent proxy = (Rent) invocationHandler.getProxy();
        proxy.rent();
    }
}
