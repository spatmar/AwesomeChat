package ru.patmar.awesomechat;

public class AwesomeMessage {

    private String textMessage;
    private String userName;
    private String sender;
    private String recipient;
    private String imageUrl;
    private boolean isMine;

    public AwesomeMessage() {
    }


    public AwesomeMessage(String textMessage, String userName, String sender, String recipient, String imageUrl, boolean isMine) {
        this.textMessage = textMessage;
        this.userName = userName;
        this.sender = sender;
        this.recipient = recipient;
        this.imageUrl = imageUrl;
        this.isMine = isMine;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }
}
