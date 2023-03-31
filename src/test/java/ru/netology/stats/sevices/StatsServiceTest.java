package ru.netology.stats.sevices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void shouldCalculateSumOfAllSales() {
        StatsService service = new StatsService();
        int[] values = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int actual = service.sumOfAllSales(values);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateAverageSalesPerMonth() {
        StatsService service = new StatsService();
        int[] values = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        int actual = service.averageSalesPerMonth(values);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] values = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        int actual = service.maxSalesMonth(values);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();
        int[] values = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int actual = service.minSalesMonth(values);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateQuantityMonthUnderAverage() {
        StatsService service = new StatsService();
        int[] values = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.quantityMonthUnderAverage(values);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateQuantityMonthOverAverage() {
        StatsService service = new StatsService();
        int[] values = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.quantityMonthOverAverage(values);
        Assertions.assertEquals(expected, actual);
    }


}
