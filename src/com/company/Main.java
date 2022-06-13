package com.company;

import com.company.models.Asteroide;
import com.company.models.Nave;

public class Main {

    public static void main(String[] args) {
        Nave nave = new Nave(12, 23, 'N', 200.00, 5);
        Asteroide asteroide = new Asteroide(50, 25, 'O', 5);

        nave.girar('S');
        nave.irA(13, 12, 'S');
        asteroide.irA(10, 22, 'L');
        System.out.println(asteroide.getDirecao());


    }
}
