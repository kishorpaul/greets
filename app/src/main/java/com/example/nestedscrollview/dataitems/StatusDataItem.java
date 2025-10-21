package com.example.nestedscrollview.dataitems;

public class StatusDataItem {
    private int mImage;
    private String mUsername;

    public StatusDataItem(int image, String username){
        this.mImage = image;
        this.mUsername = username;
    }

    public void setmUsername(String username){
        this.mUsername = username;
    }

    public String getmUsername(){
        return this.mUsername;
    }

    public int getmImage(){
        return this.mImage;
    }

    public void setmImage(int image){
        this.mImage = image;
    }

}
