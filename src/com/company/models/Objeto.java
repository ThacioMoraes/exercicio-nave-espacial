package com.company.models;

public abstract class Objeto {

    private int posX;
    private int posY;
    private char direcao;

    public Objeto(int posX, int posY, char direcao) {
        this.posX = posX;
        this.posY = posY;
        this.direcao = direcao;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    abstract void irA(int x, int y, char direcao);
}
