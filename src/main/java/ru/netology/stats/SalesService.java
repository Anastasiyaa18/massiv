package ru.netology.stats;


public class SalesService {
    public int sum(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total = sale + total;
        }
        return total;
    }

    public int averageValue(int[] sales) {
        int average = sum(sales) / sales.length;
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
        int belowAverage = 0;
        int average = averageValue(sales);
        for (int sale : sales) {
            if (sale < average) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int aboveAverage(int[] sales) {
        int aboveAverage = 0;
        int average = averageValue(sales);
        for (int sale : sales) {
            if (sale > average) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}
