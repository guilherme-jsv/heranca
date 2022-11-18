package org.example;

import java.awt.*;

public class Linha extends FormaGeometrica{

    private double[] fim;


    public Linha(double[] inicial, double[] fim, String cor) {
        super(inicial, cor);
        this.fim = fim;
    }

    @Override
    public void desenhar() {
        System.out.println("desenhando linha" + cor) ;
    }
}
