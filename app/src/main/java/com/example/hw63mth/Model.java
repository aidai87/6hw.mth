package com.example.hw63mth;

public class Model {
    private String textview;
    private int image_view;
    private int keyId;

    public Model(String textview, int image_view, int keyId) {
        this.textview = textview;
        this.image_view = image_view;
        this.keyId = keyId;
    }

    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    public Model(String textview, int image_view) {        this.textview = textview;
        this.image_view = image_view;
    }

    public String getTextview() {
        return textview;
    }

    public void setTextview(String textview) {
        this.textview = textview;
    }

    public int getImage_view() {
        return image_view;
    }

    public void setImage_view(int image_view) {
        this.image_view = image_view;
    }
}
