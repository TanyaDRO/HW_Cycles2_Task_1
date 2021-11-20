package ru.netology.stats;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        return sumAllSales(sales) / sales.length;
    }


    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
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

    public long lowSales(long[] sales) {
        long averageMonth = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averageMonth) {
                count++;
            }
        }
        return count;
    }

    public long highSales(long[] sales) {
        long averageMonth = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averageMonth) {
                count++;
            }
        }
        return count;
    }
}
