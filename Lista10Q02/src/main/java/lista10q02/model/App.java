/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista10q02.model;

/**
 *
 * @author leandro
 */
public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("FST");
        Vendedor vendedor01 = new Vendedor("Luiz", 1000, 0.10);
        Vendedor vendedor02 = new Vendedor("Paula", 1200, 0.07);
        
        Venda venda01 = new Venda(200);
        Venda venda02 = new Venda(100);
        
        Venda venda03 = new Venda(500);
        Venda venda04 = new Venda(350);
        Venda venda05 = new Venda(280);
        
        vendedor01.incluirVenda(venda01);
        vendedor01.incluirVenda(venda02);
        
        vendedor02.incluirVenda(venda03);
        vendedor02.incluirVenda(venda04);
        vendedor02.incluirVenda(venda05);
        
        Programador programador01 = new Programador("Julio", 1000 );
        Programador programador02 = new Programador("Ana", 1000 );
        Programador programador03 = new Programador("Anderson", 1200 );
        
        programador01.incluirLinguagem("C e Java");
        programador02.incluirLinguagem("Java e C#");
        programador03.incluirLinguagem("Phynton");
        
        Funcionario funcionario01 = new Funcionario("Jose", 1000);
        Funcionario funcionario02 = new Funcionario("Maria", 1400);
        empresa.incluirFuncionario(vendedor01);
        empresa.incluirFuncionario(vendedor02);
        empresa.incluirFuncionario(programador01);
        empresa.incluirFuncionario(programador02);
        empresa.incluirFuncionario(programador03);
        empresa.incluirFuncionario(funcionario01);
        empresa.incluirFuncionario(funcionario02);
        System.out.println("Custo total salarios: " + empresa.calcularSalarios());
        
        
        
        
        
        
    }
}
