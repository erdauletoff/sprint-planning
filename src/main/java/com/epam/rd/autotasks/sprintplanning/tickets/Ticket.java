package com.epam.rd.autotasks.sprintplanning.tickets;

public class Ticket {
    private final int id;
    private final String name;
    private final int estimate;
    public boolean isComp;
    public Ticket(int id, String name, int estimate) {
        this.id = id;
        this.name = name;
        this.estimate = estimate;
        this.isComp = false;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return isComp;
    }

    public void complete() {
        isComp = true;
    }

    public int getEstimate() {
        return estimate;
    }

}