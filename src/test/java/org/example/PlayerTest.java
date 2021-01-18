package org.example;

import org.example.exceptions.MissedShotException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void shootsAndScores() {
        Player player = new Player();
        player.setShootingAverage(100.0);
        boolean expected = true;
        boolean actual = false;
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
        Player player = new Player();
        player.setShootingAverage(0.0);
        boolean expected = true;
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
    }

    @Test
    public void setName() {
    }

    @Test
    public void getNumber() {
    }

    @Test
    public void setNumber() {
    }

    @Test
    public void getPosition() {
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