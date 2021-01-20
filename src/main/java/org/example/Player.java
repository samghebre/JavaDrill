package org.example;

import org.example.exceptions.MissedShotException;

public class Player {
    private String name;
    private Integer number;
    private String position;
    private Double height;
    private Double shootingAverage;
    private Double salary;

    public Player(String name, Integer number, String position, Double height, Double shootingAverage, Double salary) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.height = height;
        this.shootingAverage = shootingAverage;
        this.salary = salary;
    }

    public void shoot() throws MissedShotException {
        throw new MissedShotException();
    }

    public String getName() {
        name = "Gideon";
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;

    }

    public Double getShootingAverage() {
        return shootingAverage;
    }

    public void setShootingAverage(Double shootingAverage) {
        this.shootingAverage = shootingAverage;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

