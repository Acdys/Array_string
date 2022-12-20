package ru.netology.stats.Array_string.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindMinSale(){

        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
    @Test
    public void shouldFindMaxSale(){

        StatsService service = new StatsService();

        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
    @Test
    public void shouldFindSumSales() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void shouldFindMiddleSumSales() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMiddleSum = 15;
        int actualMiddleSum = service.middleSumSales(sales);

        Assertions.assertEquals(expectedMiddleSum, actualMiddleSum);
    }
    @Test
    public void shouldFindUnderMiddleSumSales() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedUnderMiddleSum = 5;
        int actualUnderMiddleSum = service.underMiddleSumSales(sales);

        Assertions.assertEquals(expectedUnderMiddleSum, actualUnderMiddleSum);
    }
    @Test
    public void shouldFindMoreMiddleSumSales() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMoreMiddleSum = 5;
        int actualMoreMiddleSum = service.moreMiddleSumSales(sales);

        Assertions.assertEquals(expectedMoreMiddleSum, actualMoreMiddleSum);
    }
}
