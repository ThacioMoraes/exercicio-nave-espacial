package com.company.models;

public class Asteroide extends Objeto{
    private int danos;

    public Asteroide(int posX, int posY, char direcao, int danos) {
        super(posX, posY, direcao);
        this.danos = danos;
    }

    public void irA(int x, int y, char direcao){
        System.out.println("indo para x: " + x + " y: " + y + "!");
        setDirecao(direcao);
        setPosX(x);
        setPosY(y);
    }
}
