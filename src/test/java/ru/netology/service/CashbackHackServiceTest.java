package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void TestCashbackHackService1() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 1;
        int actual = testCashback.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestCashbackHackService500() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 500;
        int actual = testCashback.remain(1500);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void TestCashbackHackService999() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 999;
        int actual = testCashback.remain(1001);

        Assert.assertEquals(expected, actual);
    }


    @org.junit.Test
    public void TestCashbackHackServiceZero() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 0;
        int actual = testCashback.remain(1000);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void TestCashbackHackServiceJupiter1() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 1;
        int actual = testCashback.remain(999);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void TestCashbackHackServiceJupiter500() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 500;
        int actual = testCashback.remain(1500);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void TestCashbackHackServiceJupiter999() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 999;
        int actual = testCashback.remain(1001);

        Assertions.assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    public void TestCashbackHackServiceJupiterZero() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 0;
        int actual = testCashback.remain(1000);

        Assertions.assertEquals(expected, actual);
    }
}