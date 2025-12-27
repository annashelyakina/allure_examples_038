package ru.arcadia.tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("arcadia_tests")
public class UserRequest {
    @Test
    @DisplayName("Открытие и заполение формы Связаться")
    void closeCookieMessage() {
        step("Открываем главную страницу");
        step("Нажимаем на кнопку Связаться в правом верхнем углу");
        step("Заполняем форму Связаться", () -> {
            step("Вводим имя Anna");
            step("Вводим email annatest123@test.test");
            step("Вводим номер телеофна 123123345");
            step("Заполняем  поле Как мы можем помочь? текстом Здравствуйте! Необходима Ваша помощь в разработке софра для моего бизнеса Group Prof 123@#$");
            step("Отмечаем галочкой Я даю согласние на обработку персональных данных");
            step("Отмечаем галочкой Я прочитал Политику конфиденциальности и согласен с ней");
        });
        step("Нажимаем на кнопку Отправить");
        step("Проверяем закрытие формы Связаться");
    }
}
