package homework4.ex4.oneGramChat;

/**
 * Создать Пользователя(имя, пароль, список сообщений)
 */

public class User {
    private String name;
    private String password;
    private Message[] messages;
    private static final int MAX_MESSAGES = 100;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.messages = new Message[MAX_MESSAGES];
    }

    public Message[] getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void sendMessage(User recipient, String text) {
        Message outgoingMessage = new Message(text, this.name, recipient.getName(), false);
        recipient.receiveIncomingMessage(outgoingMessage);
        addMessage(outgoingMessage);
    }

    public void receiveIncomingMessage(Message incomingMessage) {
        incomingMessage.setIncoming(true);
        addMessage(incomingMessage);
    }

    private void addMessage(Message message) {
        for (int i = 0; i < MAX_MESSAGES; i++) {
            if (messages[i] == null) {
                messages[i] = message;
                break;
            }
        }
    }
}
