/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

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
     *
     * @param x Eixo x
     * @param y Eixo y
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
     *
     * @return o quandrante em qual o ponto esta localizado
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
     *
     * @return
     */
    public boolean estaIncidindoSobreX() {

        return y == 0;

    }

    /**
     * Metodo para verificar se esta em cima do eixo y
     *
     * @return 
     */
    public boolean estaIncidindoSobreY() {

        return x == 0;

    }

    /**
     * Metodo para calcular a distancia de um ponto
     *
     * @param outroPonto ponto a ser utilizado para medir a distancia
     * @return o calculo da distancia euclidiana
     */
    public double calcularDistancia(Ponto outroPonto) {
        
        int distanciaX = outroPonto.getX() - this.getX();
        int distanciaY = outroPonto.getY() - this.getY();
        
        return  Math.sqrt(Math.pow(distanciaX, 2) + Math.pow(distanciaY, 2));
        
        

    }
    /**
     * Realiza o calculo da distancia entre 2 pontos
     * @param p1 primeiro ponto a ser utlizado na distancia
     * @param p2 segundo ponto a ser utilizado na distancia
     * @return a distancia entre os pontos fornecidos por parametro
     */
    public static double calcularDistancia(Ponto p1, Ponto p2) {
    
        return p1.calcularDistancia(p2);
    
    }
}
