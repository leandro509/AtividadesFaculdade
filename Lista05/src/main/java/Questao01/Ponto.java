/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao01;

/**
 *
 * @author lgonascimento
 */
public class Ponto {

    private int x;
    private int y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int x, int y) {

        this.x = x;
        this.y = y;

    }

    public int getX() {

        return this.x;

    }

    public void setX(int x) {

        this.x = x;

    }

    public int getY() {

        return this.y;

    }

    public void setY(int y) {

        this.y = y;

    }

    public Quadrante identificarQuadrante() {

        if (this.x > 0 && this.y > 0) {

            return Quadrante.PRIMEIRO;

        }

        if (this.y > 0 && this.x < 0) {

            return Quadrante.SEGUNDO;

        }

        if (this.x < 0 && this.y < 0) {

            return Quadrante.TERCEIRO;

        }

        if (this.y < 0 && this.x > 0) {

            return Quadrante.QUARTO;

        }

        return Quadrante.NENHUM;

    }

    public boolean estaIncidindoSobreX() {

        if (this.x == 0) {

            return true;

        }

        return false;

    }

    public boolean estaIncidindoSobreY() {

        if (this.y == 0) {

            return true;

        }

        return false;
    }

    public double calcularDistancia(Ponto outroPonto) {
        
      
    
    }
}
