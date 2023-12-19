package homework4.ex4.oneGramChatException;

public class noCurrentUserException extends Exception {
    public noCurrentUserException() {
        super("ошибка: вы не авторизованы");
    }
}
