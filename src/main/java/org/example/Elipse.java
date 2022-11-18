package org.example;

import java.awt.*;

public class Elipse extends Bidimensional{

    private double menor;
    private double maior;
    private double foco;

    public Elipse(double[] inicial, String cor, String corFundo, double menor, double maior, double foco) {
        super(inicial, cor, corFundo);
        this.menor = menor;
        this.maior = maior;
        this.foco = foco;
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
