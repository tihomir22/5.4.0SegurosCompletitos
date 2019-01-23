/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.componentes;

import java.io.Serializable;

/**
 *
 * @author sportak
 */
public class Coberturas implements Serializable {

    private boolean oftalmologia;
    private boolean dental;
    private boolean fecundacionInVitro;

    public Coberturas(boolean oftalmologia, boolean dental, boolean fecundacionInVitro) {
        this.oftalmologia = oftalmologia;
        this.dental = dental;
        this.fecundacionInVitro = fecundacionInVitro;
    }

    public Coberturas() {
    }

    public boolean isOftalmologia() {
        return oftalmologia;
    }

    public void setOftalmologia(boolean oftalmologia) {
        this.oftalmologia = oftalmologia;
    }

    public boolean isDental() {
        return dental;
    }

    public void setDental(boolean dental) {
        this.dental = dental;
    }

    public boolean isFecundacionInVitro() {
        return fecundacionInVitro;
    }

    public void setFecundacionInVitro(boolean fecundacionInVitro) {
        this.fecundacionInVitro = fecundacionInVitro;
    }

}
