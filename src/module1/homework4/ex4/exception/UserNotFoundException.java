package module1.homework4.ex4.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super("ошибка: нет такого пользователя");
    }
}
