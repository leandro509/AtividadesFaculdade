/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista11.model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author leandro
 */
public class Teste {
    public static void main(String[] args) {
        ContaAgua conta01 = new ContaAgua(52, 0.5);
        MensalidadeEnsino mensalidade01 = new MensalidadeEnsino();
        mensalidade01.setNrCreditos(5);
        mensalidade01.setPrecoCredito(120);
        PrevidenciaPrivada investimento01 = new PrevidenciaPrivada();
        investimento01.setSaldo(500);
        investimento01.setValor(200);
        investimento01.investir();
        //investimento01.investir();
        Contas contasPagar = new Contas();
        contasPagar.incluirConta(conta01);
        contasPagar.incluirConta(mensalidade01);
        contasPagar.incluirConta(investimento01);
        System.out.println("Agua valor: " + conta01.calcularValorPagar());
        System.out.println("Mensalidade valor: " + mensalidade01.calcularValorPagar());
        System.out.println("Investimentos a Pagar: " + investimento01.calcularValorPagar());
        System.out.println("Saldo Investimentos: " + investimento01.getSaldo());
        System.out.println("Total a Pagar: " + contasPagar.calcularTotalContas());
    }
}
