package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double[] i = new double[]{1,2};
        double[] f = new double[]{2,4};

        Linha l = new Linha(i, f, "azul");
        Circulo c = new Circulo(i,"verde", "azul", 10);

        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        formas.add(c);
        formas.add(l);

        formas.forEach(fo->fo.desenhar());

        for(FormaGeometrica fo: formas){
            fo.desenhar();
        }

//        l.desenhar();
//        c.desenhar();

        l.getCor();
        c.getCor();
    }
}