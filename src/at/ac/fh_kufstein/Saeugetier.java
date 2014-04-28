/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein;

/**
 *
 * @author Natascha
 */
abstract class Saeugetier {
    
    String name;
    int alter;
    String geschlecht;
    public abstract String printAll();

    public Saeugetier(String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }
    
    
}
