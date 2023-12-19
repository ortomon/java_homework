package homework4.ex4.oneGramChatException;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super("ошибка: нет такого пользователя");
    }
}
