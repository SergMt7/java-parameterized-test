package ru.yandex.praktikum;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
@Test
public void sum() {

    Calculator calculator = new Calculator(); // создали экземпляр класса
    int firstNumber = 1;
    int secondNumber = 9;
    int actual = calculator.sum(firstNumber, secondNumber); // вызвали проверяемый метод
    int expected = 10;
    assertEquals(expected, actual); // сравнили ожидаемый результат с фактическим
}

}
