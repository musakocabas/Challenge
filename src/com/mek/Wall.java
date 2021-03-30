package com.mek;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double widht, double height) {
        this.width = (widht < 0) ? 0 : widht;
        this.height = (height < 0) ? 0 : height;
    }

    public double getWidth() {return this.width;}

    public void setWidth(double width) {this.width = (width<0) ? 0 : width;}

    public double getHeight() {return this.height;}

    public void setHeight(double height) {this.height = (height < 0) ? 0 : height;}

    public double getArea(){return this.width*this.height;}
}
