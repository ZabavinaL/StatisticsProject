package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    // Сумма всех продаж
    @Test
    void calculateAllSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateAllSum(sales);

        assertEquals(expected, actual);
    }

    // Средняя сумма продаж в месяц
    @Test
    void calculateAverageSum() {
        StatsService service = new StatsService();

        int[] average = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverageSum(average);

        assertEquals(expected, actual);
    }

    // Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    @Test
    void monthNumberMax() {
        StatsService service = new StatsService();

        int[] maximum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.monthNumberMax(maximum);

        assertEquals(expected, actual);
    }


    // Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    @Test
    void monthNumberMin() {
        StatsService service = new StatsService();

        int[] minimum = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.monthNumberMin(minimum);

        assertEquals(expected, actual);
    }


    //Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    void belowTheAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.belowTheAverage(sales);

        assertEquals(expected, actual);
    }


    //    Кол-во месяцев, в которых продажи были выше среднего
    @Test
    void aboveTheAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.aboveTheAverage(sales);

        assertEquals(expected, actual);
    }

}