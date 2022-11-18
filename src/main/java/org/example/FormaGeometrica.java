package org.example;

import java.awt.*;

public abstract class FormaGeometrica {
    protected double[] inicial;
    protected String cor;

    public FormaGeometrica(double[] inicial, String cor) {
        this.inicial = inicial;
        this.cor = cor;
    }

    public abstract void desenhar();

    public double[] getInicial() {
        return inicial;
    }

    public String getCor() {
        return cor;
    }

    public void setInicial(double[] inicial) {
        this.inicial = inicial;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
