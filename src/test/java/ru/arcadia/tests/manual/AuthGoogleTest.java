package ru.arcadia.tests.manual;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AuthGoogleTest {
    @Test
    @DisplayName("Авторизация через Google")
    void authGoole() {
        step("Открываем главную страницу");
        step("Авторизуемся как пользователь Anna Shelyakina", () -> {
            step("Вводим логин annatest123@gmail.com");
            step("Вводим пароль 1234");
            step("Нажимаем кнопку Войти");
        });
        step("Проверяем, что авторизовались правильно", () -> {
            step("В правом верхнем углу видим имя пользователя");
        });
        step("Проверяем, что авторизовались правильно", () -> {
            step("В правом верхнем углу видим имя пользователя");
        });
        step("Проверяем, что данные профиля обновились из Google", () -> {
            step("Имя пользователя Anna Shelyakina");
            step("Почта: annatest123@gmail.com");
            step("Аватарка");
        });
    }
}
