package org.example;



public abstract class Bidimensional extends FormaGeometrica{
    private String corFundo;

    public Bidimensional(double[] inicial, String cor, String corFundo) {
        super(inicial, cor);
        this.corFundo = corFundo;
    }

    public abstract double getArea();

    public abstract double getPerimetro();


}
