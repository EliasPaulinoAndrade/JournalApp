package com.example.elias.journalapp.views;

/**
 * Created by Elias on 20/03/2017.
 */

public class PostButton {
    private String text;
    private Integer img;

    public PostButton(String text, Integer img) {
        this.text = text;
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }
}
