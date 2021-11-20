package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sumAllSales(allSales);

        assertEquals(expected, actual);

    }

    @Test
    void averageSales() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSales(allSales);

        assertEquals(expected, actual);

    }

    @Test
    void maxSalesMonth() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void minSalesMonth() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void lowSalesMonth() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.lowSales(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void highSalesMonth() {
        StatsService service = new StatsService();
        long[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.highSales(allSales);

        assertEquals(expected, actual);
    }
}