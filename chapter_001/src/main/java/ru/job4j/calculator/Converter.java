package ru.job4j.calculator;

/**
 * Конвертор валюты.
 */
public class Converter {
    private static final double KURS_EURO = 70; // Константа курс евро
    private static final double KURS_DOLLAR = 60; // Константа курс доллара

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(int value) {
        return value / KURS_EURO;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public double rubleToDollar(int value) {
        return value / KURS_DOLLAR;
    }

    /**
     * Конвертируем евро в рубли.
     * @param valueEuro евро.
     * @return Рубли.
     */
    public double euroToRuble(int valueEuro) {
        return valueEuro * KURS_EURO;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param valueDollar доллары.
     * @return Рубли.
     */
    public double dollarToRuble(int valueDollar) {
        return valueDollar * KURS_DOLLAR;
    }
}