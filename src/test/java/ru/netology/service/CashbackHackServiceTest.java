package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service;

    {
        service = new CashbackHackService();
    }

    @Test

    public void shouldReturn500IfAmountIs500() {

        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldReturn0IfAmountIs1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn100IfAmountIs1() {
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs2000() {
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}