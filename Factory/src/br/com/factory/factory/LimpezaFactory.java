/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.factory.factory;

import br.com.factory.model.Limpeza;
import br.com.factory.model.Produto;

/**
 *
 * @author eduar
 */
public class LimpezaFactory extends ProdutoFactory {
    @Override
    protected Limpeza instanciarProduto() {
        return new Limpeza ();
    }
}   

