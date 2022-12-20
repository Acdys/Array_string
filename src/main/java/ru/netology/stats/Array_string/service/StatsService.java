package ru.netology.stats.Array_string.service;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
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

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int middleSumSales(int[] sales) {
        int middleSum = 0;
        if (sales.length > 0) {

            int sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            middleSum = sum / sales.length;
        }
        return middleSum;
    }
    public int underMiddleSumSales(int[] sales){
        int underMiddleSum = 0;
        for (int i=0; i < sales.length; i++){
            if (sales[i] < middleSumSales(sales)) {
                underMiddleSum++;
            }
        }
        return underMiddleSum;
    }
    public int moreMiddleSumSales(int[] sales){
        int moreMiddleSum = 0;
        for (int i=0; i < sales.length; i++){
            if (sales[i] > middleSumSales(sales)) {
                moreMiddleSum++;
            }
        }
        return moreMiddleSum;
    }
}