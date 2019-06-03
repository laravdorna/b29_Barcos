/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b29_alquilerbarcos;

import java.util.ArrayList;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class B29_AlquilerBarcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         

        Barco b1 = new Vela(10, 2);
        Barco b2 = new Motor(5, 3);
        Barco b3 = new Yate(30, 300, 3);
        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(b1);
        barcos.add(b2);
        barcos.add(b3);
        Barco.printCalculos(barcos);
    }

}
