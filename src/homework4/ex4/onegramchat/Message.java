package homework4.ex4.onegramchat;

/**
 * Создать сообщение (текст, входящее/исходящее, кому/от кого)
 */

public class Message {
    private String text;
    private boolean isIncoming; // true - входящее, false - исходящее
    private String sender;
    private String recipient;

    public Message(String text, String sender, String recipient, boolean isIncoming) {
        this.text = text;
        this.sender = sender;
        this.recipient = recipient;
        this.isIncoming = isIncoming;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isIncoming() {
        return isIncoming;
    }

    public void setIncoming(boolean incoming) {
        isIncoming = incoming;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
