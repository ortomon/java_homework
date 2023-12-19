package homework4.ex4.oneGramChatException;

public class AlreadyAuthenticatedException extends Exception {
    public AlreadyAuthenticatedException() {
        super("Ошибка: вы уже авторизованы.");
    }
}
