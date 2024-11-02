package ru.netology;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class gitCashbackHackServiceTest {

    @Test
    public void calculateCashbackHackForAmountLessBoundary()
    {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateCashbackHackForAmountEqBoundary()
    {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual  = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

}