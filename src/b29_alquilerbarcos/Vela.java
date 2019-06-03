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
public class Vela extends Barco{
    
    protected int mastiles;
    
    public Vela(int dias, int mastiles) {
        this.mastiles = mastiles;
        super.dias = dias; 
    }
    
    @Override
    public float calcularAlquiler() {
        return super.calcularAlquiler() + (8* mastiles);
    }
}
