package module1.homework4.ex4.exception;

public class MaxUsersReachedException extends Exception {
    public MaxUsersReachedException() {
        super("Ошибка: достигнуто максимальное количество пользователей.");
    }
}
