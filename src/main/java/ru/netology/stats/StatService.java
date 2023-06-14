package ru.netology.stats;

public class StatService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        if (sales.length != 0) {
            return sum(sales) / sales.length;
        }
        return 0;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int monthsSalesBelowAverage(long[] sales) {
        int result = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                result++;
            }
        }
        return result;
    }

    public int monthsSalesAboveAverage(long[] sales) {
        int result = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                result++;
            }
        }
        return result;
    }
}
