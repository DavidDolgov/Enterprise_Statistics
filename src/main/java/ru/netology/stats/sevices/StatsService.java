package ru.netology.stats.sevices;

public class StatsService {

    public int sumOfAllSales(int[] values) {
        int sum = 0;
        for (int t : values) {
            sum = sum + t;
        }
        return sum;
    }

    public int averageSalesPerMonth(int[] values) {
        int sum = sumOfAllSales(values);
        return sum / values.length;
    }

    public int maxSalesMonth(int[] values) {
        int maxSales = 0;
        int maxMonth = 0;
        for (int sale : values) {
            if (sale >= values[maxMonth]) {
                maxMonth = maxSales;
            }
            maxSales = maxSales + 1;
        }
        return maxMonth + 1;
    }

    public int minSalesMonth(int[] values) {
        int minSales = 0;
        int minMonth = 0;
        for (int sale : values) {
            if (sale <= values[minMonth]) {
                minMonth = minSales;
            }
            minSales = minSales + 1;
        }
        return minMonth + 1;
    }

    public int quantityMonthUnderAverage(int[] values) {
        int quantityMonth = 0;
        int sum = averageSalesPerMonth(values);
        for (int sale : values) {
            if (sale < sum) {
                quantityMonth = quantityMonth + 1;
            }
        }
        return quantityMonth;
    }

    public int quantityMonthOverAverage(int[] values) {
        int quantityMonth = 0;
        int sum = averageSalesPerMonth(values);
        for (int sale : values) {
            if (sale > sum) {
                quantityMonth = quantityMonth + 1;
            }
        }
        return quantityMonth;
    }

}
