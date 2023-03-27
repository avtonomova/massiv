package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.allSum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.MaxSales(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.MinSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMonthBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testMonthHigherAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }
}
