package ru.netology;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void calculateCashbackHackForAmountLessBoundary ()
    {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateCashbackHackForAmountEqBoundary()
    {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual  = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
