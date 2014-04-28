/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein_uebung02;

import at.ac.fh_kufstein_uebung02.classes.Auto;
import at.ac.fh_kufstein_uebung02.classes.Wasserfahrzeug;

/**
 *
 * @author Natascha
 */
public class Aufruf {
    
    public static void main(String[] args)
    {
      
        Auto bmw = new Auto ((short) 4, (short)4, "silber", (short)220, (short)5, (short)0);
        Auto audi = new Auto ((short) 8, (short) 4, "schwarz",(short) 180, (short) 5, (short) 0);
        Wasserfahrzeug titanic = new Wasserfahrzeug(10.54, (short) 3, 100.000, (short) 0, "blau", (short) 51.000, (short) 0, (short)0);
        
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());
    }
}
