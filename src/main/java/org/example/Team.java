package org.example;

public class Team {

    private String name;
    private String city;
    private String mascot;
    private Iterable<Player> players;
    private Integer maxNumber;
    private Double salaryCap;

    public Team(String name, String city, String mascot, Iterable<Player> players, Integer maxNumber, Double salaryCap) {
        this.name = name;
        this.city = city;
        this.mascot = mascot;
        this.players = players;
        this.maxNumber = maxNumber;
        this.salaryCap = salaryCap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public Iterable<Player> getPlayers() {
        players.iterator();
        return players;
    }

    public void setPlayers(Iterable<Player> players) {
        this.players = players;
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public Double getSalaryCap() {
        return salaryCap;
    }

    public void setSalaryCap(Double salaryCap) {
        this.salaryCap = salaryCap;
    }

    public void addPlayer() {

    }
}
