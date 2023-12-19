package homework4.ex4.oneGramChatException;

public class MaxUsersReachedException extends Exception {
    public MaxUsersReachedException() {
        super("Ошибка: достигнуто максимальное количество пользователей.");
    }
}
