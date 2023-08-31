package ru.netology.stats;


public class SalesService {
    public int summa(int[] sales) {
        int total = 0;
        for (int s : sales) {
            total = s + total;
        }
        return total;
    }

    public int srZnach(int[] sales) {
        int average = summa(sales) / sales.length;
        return average;
    }

    public int maxMonths(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;

            }
        }
        return maxMonth + 1;
    }

    public int minMonths(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;

            }
        }
        return minMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int quantity = 0;
        int average = srZnach(sales);
        for (int s : sales) {
            if (s < average) {
                quantity++;
            }
        }
        return quantity;
    }

    public int aboveAverage(int[] sales) {
        int quantity = 0;
        int average = srZnach(sales);
        for (int s : sales) {
            if (s > average) {
                quantity++;
            }
        }
        return quantity;
    }
}
