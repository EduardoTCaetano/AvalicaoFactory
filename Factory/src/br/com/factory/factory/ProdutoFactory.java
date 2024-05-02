/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.factory.factory;

import br.com.factory.model.Produto;

/**
 *
 * @author eduar
 */
public abstract class ProdutoFactory {

    protected abstract Produto instanciarProduto();

    public Produto criarProduto(String descricao, double value) {
        Produto produto = instanciarProduto();
        produto.setDescricao(descricao);
        produto.setValue(value);
        System.out.println("Descrição: " + descricao);
        System.out.println("Peso: " + value);
        return produto;

    }
}
