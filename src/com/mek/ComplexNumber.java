package com.mek;

public class ComplexNumber {
    private double real;
    private double imaginary;



    public ComplexNumber(double real, double imaginary) {this.real = real; this.imaginary = imaginary;}

    public double getReal() {return this.real; }
    public double getImaginary() {  return this.imaginary;  }

    public void add(double real,double imaginary){this.real+=real ;this.imaginary+=imaginary;}
    public void add(ComplexNumber cn) {add(cn.getReal(),cn.getImaginary());}

    public void subtract(double real,double imaginary){this.real-=real ;this.imaginary-=imaginary;}
    public void subtract(ComplexNumber cn) {subtract(cn.getReal(),cn.getImaginary());}
}
