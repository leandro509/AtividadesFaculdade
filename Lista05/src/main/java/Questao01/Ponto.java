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

    /**
     * Construtor para as coordenadas x e y serem iniciadas como 0.
     */
     
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Construtor no qual as coordenadas receberao os parametros x e y
     * @param x
     * @param y 
     */

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

    /**
     * Metodo para verificar em qual quadrante o ponto esta localizado
     * @return 
     */
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
    /**
     * Metodo para verificar se esta em cima do eixo x
     * @return 
     */
    public boolean estaIncidindoSobreX() {

        if (this.x == 0) {

            return true;

        }

        return false;

    }
    
    /**
     * Metodo para verificar se esta em cima do eixo y
     * @return 
     */
    public boolean estaIncidindoSobreY() {

        if (this.y == 0) {

            return true;

        }

        return false;
    }

    /**
     * Metodo para calcular a distancia de um ponto
     * @param outroPonto
     * @return 
     */
    public double calcularDistancia(Ponto outroPonto) {
        
      double d1 = Math.pow(this.x,2) + Math.pow(this.y,2);
        Math.sqrt(d1);
        return d1;
    
    }
}
