/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b29_alquilerbarcos;

import java.util.ArrayList;

/**
 *
 * @author lvazquezdorna
 */
public class Barco {
        protected int dias;
    protected int eslora;
    
    public float calcularAlquiler(){
        return dias * (eslora * 10);
    }

    public static void printCalculos(Barco... barcos){
        for(Barco barco : barcos){
            System.out.println(barco.calcularAlquiler() + " €");
        }
    }
    public static <E extends Barco> void printCalculos(ArrayList<E> barcos){
        for(E e : barcos){
            System.out.println(e.calcularAlquiler() + " €");
        }
    }
    
}
