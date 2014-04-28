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
public class Student extends Menschen{

    String matrikelnummer;
    String studiengang;
    
    public Student(String vorname, String nachname, int alter, String matrikelnummer, String studiengang) {
        super(vorname, nachname, alter);
        matrikelnummer = matrikelnummer;
        studiengang = studiengang;
    }

    @Override
    public void Status() {
        System.out.println("Es handelt sich um einen Studenten " + vorname + " " + nachname + " " + alter + " " + matrikelnummer + " " + studiengang);
    }
    
    public static void main(String[] args)
    {
    Menschen nati = new Menschen("Natascha", "Mariacher", 19);
    nati.Status();
    
    Student natnat = new Student("Natascha", "Mariacher", 19, "1310653411", "Web Business & Technology");
    natnat.Status();
    }
    
}
