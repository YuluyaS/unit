package ru.netology;



import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void calculateCashbackHackForAmountLessBoundary ()
    {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void calculateCashbackHackForAmountEqBoundary()
    {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual  = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
