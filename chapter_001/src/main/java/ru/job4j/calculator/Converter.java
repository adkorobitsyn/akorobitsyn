package ru.job4j.calculator;

/**
 * Конвертор валюты.
 */
public class Converter {

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public double rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллары
     */
    public double rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвертируем евро в рубли.
     * @param valueEuro евро.
     * @return Рубли.
     */
    public double euroToRuble(int valueEuro) {
        return valueEuro * 70;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param valueDollar доллары.
     * @return Рубли.
     */
    public double dollarToRuble(int valueDollar) {
        return valueDollar * 60;
    }
}