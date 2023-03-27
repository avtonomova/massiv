package ru.netology.stats;

public class StatsService {

    public long allSum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;

        }
        return result;

    }


    public long average(long[] sales) {
        return allSum(sales) / 12;
    }

    public int MaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;
    }


    public int MinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;

        }
        return minMonth + 1;

    }

    public int monthBelowAverage(long[] sales) {
        int total = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                total++;

            }
        }
        return total;
    }


    public int monthHigherAverage(long[] sales) {
        int total = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                total++;

            }
        }
        return total;
    }
}


