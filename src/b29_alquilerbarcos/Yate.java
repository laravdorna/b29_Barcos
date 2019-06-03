/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b29_alquilerbarcos;

/**
 *
 * @author lvazquezdorna
 */
public class Yate extends Barco {

    protected int cv;
    protected int camarotes;

    public Yate(int dias, int cv, int camarotes) {
        this.cv = cv;
        super.dias = dias;
    }

    @Override
    public float calcularAlquiler() {
        return super.calcularAlquiler() + (2 * cv) + (25 * camarotes);
    }
}
