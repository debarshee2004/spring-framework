package org.debarshee;

public class Alien {
    private int identity;
    private Service serve;

    public Alien() {
        System.out.println("Alien Object Created..");
    }

    public Service getServer() {
        return serve;
    }

    public void setServer(Service serve) {
        this.serve = serve;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public void information() {
        System.out.println("Hello, I am an alien form outside for your galaxy.");
    }
}
