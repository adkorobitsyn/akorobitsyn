package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
    private static final double PARAMETR_MALE = 100; // Константа вычет параметра из роста для мужчин
    private static final double PARAMETR_FEMALE = 110; // Константа вычет параметра из роста для женщин
    private static final double PARAMETR_KOEF = 1.15; //Константа коэффициент для определения подходящего веса

    /**
     * Идеальный вес для мужчины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        return (height - PARAMETR_MALE) * PARAMETR_KOEF;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        return (height - PARAMETR_FEMALE) * PARAMETR_KOEF;
    }
}