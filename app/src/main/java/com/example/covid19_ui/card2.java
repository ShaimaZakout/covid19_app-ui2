package com.example.covid19_ui;

public class card2 {
    private int img;
    private String name, name2;

    public card2(int img, String name, String name2) {
        this.img = img;
        this.name = name;
        this.name2 = name2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
