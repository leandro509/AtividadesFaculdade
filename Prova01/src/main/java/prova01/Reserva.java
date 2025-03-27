/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova01;

/**
 *
 * @author leandro
 */
public class Reserva {
     private  int qtdDias;
 private int qtdHospedes;
 private TipoQuarto quarto;
 
 public Reserva() {
 
 }
 
 public Reserva(int qtdDias, int qtdHospedes, TipoQuarto quarto) {
     this.qtdDias = qtdDias;
     this.qtdHospedes = qtdHospedes;
     this.quarto = quarto;
 }
 public int getQtdDias() {
     return qtdDias;
 }
 public void setQtdDias(int qtdDias) {
     if(qtdDias <= 0) {
         throw new IllegalArgumentException("A quantidade de dias nao pode ser menor ou igual a 0!");
     }
     this.qtdDias = qtdDias;
 }
 public int getQtdHospedes() {
     return qtdHospedes;
 }
 public void setQtdHospedes(int qtdHospedes) {
     if(qtdHospedes <= 0) {
         throw new IllegalArgumentException("A quantidade de hospedes nao pode ser menor ou igual a 0!");
     }
     this.qtdHospedes = qtdHospedes;
 }
 public TipoQuarto getQuarto() {
     return quarto;
 }
 public void setQuarto(TipoQuarto quarto) {
     if(quarto == null) {
         throw new IllegalArgumentException("Nenhum quarto selecionado");
     }
     
     this.quarto = quarto;
 }
 
   
 /**
  * O metodo calcular reserva primeiro checa o tipo de quarto que os hospedes estao,
  * apos isso checam a quantidade de hospedes no quarto, se o quarto tiver mais hospedes do que o recomendado,
  * vai ser pago um taxa por cada hospede a mais,
  * no final calcula o valor da diaria e o valor da alimentacao se tiver que pagar.
  * @return retorna o valor total da reserva
  */
 public double calcularValorReserva() {
     
     if(this.quarto == TipoQuarto.COMUM) {
         if(this.qtdHospedes < 3) {
             return (((this.qtdHospedes * 10) * this.qtdDias) + (200 * this.qtdDias));
         }else {
             return ((((this.qtdHospedes - 2) * this.qtdDias) * 50)) + ((this.qtdHospedes * 10) * this.qtdDias) + (this.qtdDias * 200);
         }
     }else if(this.quarto == TipoQuarto.FAMILIA) {
         if(this.qtdHospedes < 5) {
             return ((350) * this.qtdDias);
         }else{
             return ((((this.qtdHospedes - 4) * 60) * this.qtdDias) + ((350) * this.qtdDias));
         }
     }
     
     else{
         return ((1000) * this.qtdDias);
     }
     
     
 }
}
