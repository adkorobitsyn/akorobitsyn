package ru.job4j.condition;

/**
 * @author Alexey Korobitsyn (alogy@bk.ru)
 * @version $Id$
 * @since 0.1
 */

public class DummyBot {
    /**
     * Отвечает на вопросы
     * @param question Вопрос от клиента.
     * @return Возвращает ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            // Заменить на правильный ответ rsl = "Привет, умник.".
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) { // Заменить на проверку, что этот вопрос извествен боту и он знает как на него ответить.
            // заменить на правильный ответ rsl = "До скорой встречи.".
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
