package com.company.models;

public class Nave extends Objeto{

    private double velocidade;
    private int vida;

    public Nave(int posX, int posY, char direcao, double velocidade, int vida) {
        super(posX, posY, direcao);
        this.velocidade = velocidade;
        this.vida = vida;
    }

    public int restaVida(){
        return this.vida;
    }

    public void girar(char direcao){
        this.setDirecao(direcao);
    }

    public void irA(int x, int y, char direcao){
        if(this.getDirecao() == direcao){
            System.out.println("indo para x: " + x + " y: " + y + " na velocidade " + this.velocidade);
            setPosX(x);
            setPosY(y);
        } else {
            System.out.println("Precisamos direcionar a nave para " + direcao + "!");
        }
    }
}
