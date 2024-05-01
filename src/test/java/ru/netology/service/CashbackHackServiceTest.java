package ru.netology.service;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void TestCashbackHackService1() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 1;
        int actual = testCashback.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCashbackHackService500() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 500;
        int actual = testCashback.remain(1500);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCashbackHackService999() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 999;
        int actual = testCashback.remain(1001);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCashbackHackServiceZero() {
        CashbackHackService testCashback = new CashbackHackService();

        int expected = 0;
        int actual = testCashback.remain(1000);

        Assert.assertEquals(expected, actual);
    }
}