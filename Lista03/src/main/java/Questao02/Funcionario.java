/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

import Questao01.*;

/**
 *
 * @author lgonascimento
 */
public class Funcionario {

    private String nome;
    private double salario;
    private double calculoImposto = 0;
    private static final double FAIXA_01 = 0;
    private static final double FAIXA_02 = 0.075;
    private static final double FAIXA_03 = 0.15;
    private static final double FAIXA_04 = 0.225;
    private static final double FAIXA_05 = 0.275;

    public void setNome(String nome) {
        
        if(nome.trim().isEmpty()) {
            
            throw new IllegalArgumentException("O nome nao pode estar em branco!");
        
        }
        
        this.nome = nome;

    }

    public String getNome() {

        return this.nome;

    }

    public void setSalario(double salario) {
        
        if(salario <= 0) {
        
            throw new IllegalArgumentException("Valor de Salario Invalido!");
        
        }
        
        this.salario = salario;

    }

    public double getSalario() {

        return this.salario;

    }

    public double calcularIrpf() {

        if (this.salario <= 1903.98) {

            this.calculoImposto = FAIXA_01;

            return this.calculoImposto;

        } else if (this.salario >= 1903.99 && this.salario <= 2826.65) {

            this.calculoImposto = (this.salario - 1903.98) * FAIXA_02;
            return this.calculoImposto;

        } else if (this.salario >= 2826.66 && this.salario <= 3751.05) {

            this.calculoImposto = (((2826.65 - 1903.98) * FAIXA_02) + ((this.salario - 2826.65) * FAIXA_03));
            return this.calculoImposto;

        } else if (this.salario >= 3751.06 && this.salario <= 4664.68) {

            this.calculoImposto = (((2826.65 - 1903.98) * FAIXA_02) + ((3751.05 - 2826.65) * FAIXA_03) + ((this.salario - 3751.05) * FAIXA_04));
            return this.calculoImposto;

        } else {
            this.calculoImposto = (((2826.65 - 1903.98) * FAIXA_02) + ((3751.05 - 2826.65) * FAIXA_03) + ((4664.68 - 3751.05) * FAIXA_04) + (this.salario - 4664.68) * FAIXA_05);
            return this.calculoImposto;
        }

    }
}
