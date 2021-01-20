package org.example;

import org.example.exceptions.MissedShotException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
Player player;

    @Before
    public void setUp() {
        player = new Player("Gideon",5,"Point guard", 6.2, 0.7, 320000000.0);

        player.setPosition("Point guard");
        player.setHeight(6.2);
        player.setShootingAverage(0.61);
        player.setSalary(32000000.0);
    }





    @Test
    public void shootsAndScores() {
        Player player = new Player("Jordan",1,"Center",6.7,0.67,21170000.0);
        player.setShootingAverage(0.67);
        boolean expected = true;
        boolean actual = true;
        try {
            player.shoot();
            actual = true;
        } catch (MissedShotException exception) {
            actual = false;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shootsAndMisses() {
        Player player = new Player("Jordan",1,"Center",6.7,0.67,21170000.0);
        player.setShootingAverage(0.0);
        boolean expected = false;
        boolean actual = false;
        try {
            player.shoot();
            actual = true;
        }catch (MissedShotException exception) {
            actual = false;
        }
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shoot() {
    }

    @Test
    public void getName() {

        String expected = "Gideon";
        String actual = player.getName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setName() {
        String name = "Jordi";
        String expected = "Gideon";
        String actual = player.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNumber() {
        Integer expected = 5;
        Integer actual = player.getNumber();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNumber() {
        Integer number = 10;
        Integer expected = 5;
        Integer actual = player.getNumber();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getPosition() {
        String expected = "Point guard";
        String actual = player.getPosition();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPosition() {
    }

    @Test
    public void getHeight() {
    }

    @Test
    public void setHeight() {
    }

    @Test
    public void getShootingAverage() {
    }

    @Test
    public void setShootingAverage() {
    }

    @Test
    public void getSalary() {
    }

    @Test
    public void setSalary() {
    }
}