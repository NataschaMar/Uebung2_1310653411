/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein_uebung02.classes;

/**
 *
 * @author Natascha
 */
public class Wasserfahrzeug extends Fahrzeug{
 
    private double tiefgang;
    private short schrauben;
    private double ladung;

    public Wasserfahrzeug(double tiefgang, short schrauben, double ladung, short reifen, enum color, short ps, short tueren, short geschwindigkeit) {
        super(reifen, color, ps, tueren, false, geschwindigkeit);
        this.tiefgang = tiefgang;
        this.schrauben = schrauben;
        this.ladung = ladung;
        
        anzahl = anzahl +1;
    }

   
    
    public double getTiefgang() {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang) {
        this.tiefgang = tiefgang;
    }

    public short getSchrauben() {
        return schrauben;
    }

    public void setSchrauben(short schrauben) {
        this.schrauben = schrauben;
    }

    public double getLadung() {
        return ladung;
    }

    public void setLadung(double ladung) {
        this.ladung = ladung;
    }
    
    
    
    public void entladen() throws InterruptedException
    {
       
       Thread.sleep(5000);
       
    }
    
    @Override
    public String toString() {
        return "Mein Wasserfahrzeug hat " + getPs() + " PS und einen Tiefgang von " + getTiefgang() + " m";
    }
}
