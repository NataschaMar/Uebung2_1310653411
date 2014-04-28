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
public class Auto extends Fahrzeug{
    
    private boolean klimaanlage; 
    private short airbags;

    public Auto(short airbags, short reifen, enum color, short ps, short tueren, short geschwindigkeit) {
        super(reifen, Blue, ps, tueren, false, geschwindigkeit);
        this.klimaanlage = false;
        this.airbags = airbags;
        color = blue;
        
        
        anzahl = anzahl +1;
    }

    
  
    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
    
    
    
    public void klimaanlageAn()
    {
        if(klimaanlage == true)
        {
            System.out.println("Klimaanlage läuft bereits");
        }
        else
        {
            klimaanlage = true;
        }
        
    }
    
    public void klimaanlageAus(){
        
       if(klimaanlage == true)
       {
           klimaanlage = false;
       }
       else
       {
           System.out.println("Die Klimaanlage ist bereits aus");
       }
    }

    

    @Override
    public String toString() {
        return "Mein Auto hat " + getPs() + " PS und fährt mit " + getGeschwindigkeit() + " km/h";
    }
    
   
    
    
    
}
