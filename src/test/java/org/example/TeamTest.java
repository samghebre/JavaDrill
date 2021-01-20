package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeamTest {

    Team team;
    private  Iterable<Player> players;



    @Before
    public void setUp() throws Exception {
        team = new Team("Eagles","Philly","", players, 15,3.44565);
    }

    @Test
    public void getName() {
        String expected = "Eagles";
        String actual = team.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setTeam(){

    }
}