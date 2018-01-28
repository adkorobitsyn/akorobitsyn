package ru.job4j.calculator;

public class Calculator {
    private double result;

    /**
     * Method void add
     * метод складывает аргументы first and second
     * и записывает результат в this.result
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method subtract
     * метод вычитает из аргумента first аргумент second
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method div
     * метод делит аргумент first на second
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multiple
     * метод умножае аргумент first на second
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method getResult
     * метод возвращает значение поля result
     * @return ответ
     */
    public double getResult() {
        return this.result;
    }
}