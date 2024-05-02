/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.factory.factory;

import br.com.factory.model.Alimenticio;
import br.com.factory.model.Produto;

/**
 *
 * @author eduar
 */
public class AlimenticioFactory extends ProdutoFactory {

    @Override
    protected Alimenticio instanciarProduto() {
        return new Alimenticio();
    }
}
