package com.lz.spring.bean;

public class Command {
    private Object state;

    public Command() {
        System.out.println("Command constructor...");
    }

    public void setState(Object commandState) {
        this.state = commandState;
    }

    public Object execute() {
        return new User(1001, "Luzhen", 23);
    }
}
