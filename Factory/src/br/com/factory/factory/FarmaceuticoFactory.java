/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.factory.factory;

import br.com.factory.model.Farmaceutico;
import br.com.factory.model.Produto;

/**
 *
 * @author eduar
 */
public class FarmaceuticoFactory extends ProdutoFactory {

    @Override
    protected Farmaceutico instanciarProduto() {
        return new Farmaceutico();
    }

    }

