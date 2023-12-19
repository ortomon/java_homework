package homework4.ex4.oneGramChat;

import homework4.ex4.oneGramChatException.*;
import java.util.Scanner;

public class OneGramChat {
    private static final int MAX_USERS = 100;
    private User currentUser;
    private User[] users;

    public OneGramChat() {
        this.currentUser = null;
        this.users = new User[MAX_USERS];
    }

    // регистрация
    public void signUp() throws MaxUsersReachedException, AlreadyAuthenticatedException {
        if (currentUser != null) {
            throw new AlreadyAuthenticatedException();
        }

        if (getUserCount() < MAX_USERS) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя пользователя:");
            String name = scanner.nextLine();
            System.out.println("Введите пароль:");
            String password = scanner.nextLine();

            User newUser = new User(name, password);
            users[getUserCount()] = newUser;
            System.out.println("Пользователь " + name + " успешно создан.");
        } else {
            throw new MaxUsersReachedException();
        }
    }

    // авторизация
    public void logIn() throws UserNotFoundException, AlreadyAuthenticatedException {
        if (currentUser != null) {
            throw new AlreadyAuthenticatedException();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        User foundUser = findUser(name, password);
        if (foundUser != null) {
            currentUser = foundUser;
            System.out.println("Вы вошли как " + currentUser.getName());
        } else {
            throw new UserNotFoundException();
        }
    }

    // выход
    public void logOut() {
        currentUser = null;
        System.out.println("Выход выполнен.");
    }

    // написать сообщение
    public void writeMessage() throws UserNotFoundException, noCurrentUserException {
        if (currentUser == null) {
            throw new noCurrentUserException();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя получателя:");
        String recipientName = scanner.nextLine();
        System.out.println("Введите текст сообщения:");
        String text = scanner.nextLine();

        User recipient = findUser(recipientName);
        if (recipient != null) {
            currentUser.sendMessage(recipient, text);
            System.out.println("Сообщение успешно отправлено.");
        } else {
            throw new UserNotFoundException();
        }
    }

    // прочитать письма текущего пользователя
    public void readMessages() throws noCurrentUserException {
        if (currentUser == null) {
            throw new noCurrentUserException();
        }

        System.out.println("Письма текущего пользователя:");
        for (Message message : currentUser.getMessages()) {
            if (message != null) {
                String messageType = (currentUser.getName().equals(message.getSender())) ? ("к " + message.getRecipient()) : ("от " + message.getSender());
                System.out.println("письмо " + messageType + ": " + message.getText());
            }
        }
    }

    public void start() throws UserNotFoundException, noCurrentUserException, MaxUsersReachedException, AlreadyAuthenticatedException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите команду: ");
            String command = scanner.nextLine();
            switch (command) {
                case "войти":
                    logIn();
                    break;
                case "новый":
                    signUp();
                    break;
                case "выйти":
                    logOut();
                    break;
                case "написать":
                    writeMessage();
                    break;
                case "прочитать":
                    readMessages();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверная команда. Попробуйте еще раз.");
            }
        }
    }

    // количество пользователей
    private int getUserCount() {
        int count = 0;
        for (User user : users) {
            if (user != null) {
                count++;
            }
        }
        return count;
    }

    // проеврка существования пользователя для авторизации
    private User findUser(String name, String password) {
        for (int i = 0; i < getUserCount(); i++) {
            User user = users[i];
            if (user != null && user.getName().equals(name) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    // проеврка существования пользователя для отправки сообщения
    private User findUser(String name) {
        for (int i = 0; i < getUserCount(); i++) {
            User user = users[i];
            if (user != null && user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}
