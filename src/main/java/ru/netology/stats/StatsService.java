package ru.netology.stats;

public class StatsService {

    // Сумма всех продаж
    public int calculateAllSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Средняя сумма продаж в месяц
    public int calculateAverageSum(int[] average) {
        int sum = calculateAllSum(average);
        return sum / average.length;
    }

    // Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int monthNumberMax(int[] maximum) {

        int max = maximum[0];
        int monthMax = 0;
        int month = 0;
        for (int value : maximum) {
            monthMax = monthMax + 1;

            if (max <= value) {
                max = value;
                month = monthMax;
            }
        }
        return month;
    }


    // Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int monthNumberMin(int[] minimum) {

        int min = minimum[0];
        int monthMin = 0;
        int month = 0;

        for (int value : minimum) {
            monthMin = monthMin + 1;

            if (min >= value) {
                min = value;
                month = monthMin;
            }
        }
        return month;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int belowTheAverage(int[] sales) {

        int avSales = calculateAverageSum(sales);
        int belowNumbers = 0;

        for (int value : sales) {
            if (avSales > value) {
                belowNumbers++;
            }
        }

        return belowNumbers;
    }

    //    Кол-во месяцев, в которых продажи были выше среднего
    public int aboveTheAverage(int[] sales) {

        int avSales = calculateAverageSum(sales);
        int aboveNumbers = 0;

        for (int value : sales) {
            if (avSales < value) {
                aboveNumbers++;
            }
        }
        return aboveNumbers;
    }
}