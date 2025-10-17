package com.example.nestedscrollview;

public class MessagesDataItem {
    private String mUsername, mMessage;
    private int mImage;

    public MessagesDataItem(String username, String message, int image){
        this.mUsername = username;
        this.mMessage = message;
        this.mImage = image;
    }

    public String getmUsername() {
        return mUsername;
    }

    public String getmMessage() {
        return mMessage;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmUsername(String username) {
        this.mUsername = username;
    }

    public void setmMessage(String message){
        this.mMessage = message;
    }

    public void setmImage(int image){
        this.mImage = image;
    }
}
