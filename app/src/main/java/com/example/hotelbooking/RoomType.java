package com.example.hotelbooking;

public class RoomType {
    private int image;
    private String type;
    private String des;

    public RoomType() {
    }

    public RoomType(int image, String type, String des) {
        this.image = image;
        this.type = type;
        this.des = des;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
