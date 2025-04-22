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
        double saldoAtual = super.getSaldo();
        
        
        if(valor > getSaldo() && valor <= limiteCredito) {
            setSaldo(saldoAtual -= valor);
            setLimiteCredito(this.limiteCredito -= valor);
        }else if(valor <= 0) {
        throw new IllegalArgumentException("Valor indisponivel para saque!");
        }
    }
}
