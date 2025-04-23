/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista09.questa01.model;

/**
 *
 * @author kleut
 */
public class ContaEspecial extends ContaBancaria {
    private double limiteCredito;

    public ContaEspecial(String numero, double saldo) {
        super(numero, saldo);
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if(limiteCredito < 0) {
            throw new IllegalArgumentException("O limite de credito nao pode ser negativo!");
        }
        this.limiteCredito = limiteCredito;
    }
    
    @Override
    public void sacar(double valor){
         if (valor <= 0) {
        throw new IllegalArgumentException("Valor indisponível para saque!");
        }
        
        double saldoAtual = super.getSaldo();
        if(valor <= saldoAtual) {
            setSaldo(saldoAtual - valor);
        }else if(valor <=  (saldoAtual + limiteCredito)) {
            double restante = valor - saldoAtual;
            setSaldo(0);
            setLimiteCredito(this.limiteCredito -= restante);
        }else {
        throw new IllegalArgumentException("Valor indisponivel para saque!");
        }
    }
}
