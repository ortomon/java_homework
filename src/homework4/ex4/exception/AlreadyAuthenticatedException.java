package homework4.ex4.exception;

public class AlreadyAuthenticatedException extends Exception {
    public AlreadyAuthenticatedException() {
        super("Ошибка: вы уже авторизованы.");
    }
}
