import View.Log;
import View.LogConsole;

import java.util.Arrays;

/** Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
 Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
 Соблюдать принципы SOLID, паттерны проектирования.
 Формат сдачи: ссылка на гитхаб проект

 */
public class Main {
    public static void main(String[] args) {

        ComplexPresenter control = new ComplexPresenter(new Log(new LogConsole()));
        control.start();


    }
}