package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesServiceTest {
    @Test
    public void totalSum() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageValue() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageValue(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMaximumSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxMonths(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMinimumSales() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minMonths(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthSalesBelowAverage() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthSalesAboveAverage() {
        SalesService service = new SalesService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.aboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}