package module1.homework4.ex4.exception;

public class noCurrentUserException extends Exception {
    public noCurrentUserException() {
        super("ошибка: вы не авторизованы");
    }
}
