/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.factory.principal;

import br.com.factory.factory.AlimenticioFactory;
import br.com.factory.factory.FarmaceuticoFactory;
import br.com.factory.factory.LimpezaFactory;
import br.com.factory.factory.ProdutoFactory;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Principal {

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        
        System.out.println("Digite a descrição de Limpeza: ");
        String descricao = dados.nextLine();
        System.out.println("Digite o pese de Limpeza: ");
        double value = Double.parseDouble(dados.nextLine());
        
        System.out.println("Digite a descrição de Alimenticio: ");
        String descricaob = dados.nextLine();
        System.out.println("Digite o peso de Alimenticio: ");
        double valueb = Double.parseDouble(dados.nextLine());
        
        System.out.println("Digite a descrição de Farmaceutico: ");
        String descricaoc = dados.nextLine();
        System.out.println("Digite o Peso de Farmaceutico: ");
        double valuec = Double.parseDouble(dados.nextLine());
        
        LimpezaFactory limpeza = new LimpezaFactory();
        ProdutoFactory alimenticio = new AlimenticioFactory();
        ProdutoFactory farmaceutico = new FarmaceuticoFactory();
        
        System.out.println("\n");
        System.out.println("##### Limpeza ####\n: ");
        limpeza.criarProduto(descricao, value);
        System.out.println("\n");
        System.out.println("##### Alimenticio ####\n: ");
        alimenticio.criarProduto(descricaob, valueb);
        System.out.println("\n");
        System.out.println("##### Farmaceutico ####\n: ");
        farmaceutico.criarProduto(descricaoc, valuec);
        System.out.println("\n");
    }
}
