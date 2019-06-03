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
public class Motor extends Barco{

    protected int cv;

    public Motor(int dias, int cv) {
        this.cv = cv;
        super.dias = dias; 
    }
    
    @Override
    public float calcularAlquiler() {
        return super.calcularAlquiler() + (2 * cv);
    }