/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.factory.model;

/**
 *
 * @author eduar
 */
public class Farmaceutico extends Produto {

    private String Posologia;

    public String getPosologia() {
        return Posologia;
    }

    public void setPosologia(String Posologia) {
        this.Posologia = Posologia;
    }
}
