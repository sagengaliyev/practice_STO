package com.company;

import java.util.Scanner;

public class Car {
    private static int id_count = 0;
    protected int id = 1;
    private String name;
    private String reason;

    public Car() {
        this.id = id_count++;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your car name?");
        String name = in.nextLine();
        this.name = name;
        System.out.println("Enter your problem?");
        String reason = in.nextLine();
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id_count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
