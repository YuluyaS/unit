import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void calculateCashbackHackForAmountLessBoundary ()
    {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateCashbackHackForAmountEqBoundary()
    {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 1000;

        int actual  = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

}
