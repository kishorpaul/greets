package com.example.nestedscrollview.dataitems;

public class StatusDataItem {
    private int mUserImage, mStatusImage;
    private String mUsername;

    public StatusDataItem(int image, int image2, String username){
        this.mUserImage = image;
        this.mStatusImage =image2;
        this.mUsername = username;
    }

    public int getmUserImage() {
        return mUserImage;
    }

    public void setmUserImage(int mUserImage) {
        this.mUserImage = mUserImage;
    }

    public int getmStatusImage() {
        return mStatusImage;
    }

    public void setmStatusImage(int mStatusImage) {
        this.mStatusImage = mStatusImage;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }
}
