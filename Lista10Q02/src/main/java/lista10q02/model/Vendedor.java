/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista10q02.model;

import java.util.ArrayList;

/**
 *
 * @author leandro
 */
public class Vendedor extends Funcionario{
    private double percentualComissao;
    private ArrayList<Venda> vendas = new ArrayList<>();
    
    public Vendedor(String nome, double salarioBase, double percentualComissao) {
        super(nome, salarioBase);
        setPercentualComissao(percentualComissao);
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if(percentualComissao < 0) {
            throw new IllegalArgumentException("O percentual de comissao nao pode ser menor que 0!");
        }
        this.percentualComissao = percentualComissao;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    
    public void incluirVenda(Venda venda) {
        vendas.add(venda);
    }
    
    @Override
    public double calcularSalario() {
        double comissaoMes = 0;
        for (int i = 0; i < vendas.size(); i++) {
            comissaoMes += getPercentualComissao() * vendas.get(i).getValor();
        }
        return (comissaoMes) + getSalarioBase();
    }

    @Override
    public String toString() {
        return "Vendedor: " + super.getNome() + "- Percentual Comissao: " + getPercentualComissao() + "- Qtd Vendas: "
                + vendas.size() + "- Salario: " + calcularSalario(); 
     }
    
    
    
}
