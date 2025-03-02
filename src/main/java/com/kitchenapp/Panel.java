package com.kitchenapp;

public class Panel {
    private String name;
    private int width;
    private int height;

    public Panel(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " - Width: " + width + " mm, Height: " + height + " mm";
    }
}
