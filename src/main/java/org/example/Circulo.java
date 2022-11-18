package org.example;

import java.awt.*;

public class Circulo extends Bidimensional {
    private double raio;

    public Circulo(double[] inicial, String cor, String corFundo, double raio) {
        super(inicial, cor, corFundo);
        this.raio = raio;
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetro() {
        return 0;
    }

    @Override
    public void desenhar() {

    }
}
