/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package provagruppo12università;

/**
 *
 * @author nando
 * @time Nov 10, 2021 6:20:04 PM
 */
public class Person {
    private String name;
    private String surname;
    private int eta;
    private int sesso;
    private int sessoBrutale;

    public Person(String name, String surname, int eta , int sesso) {
        this.name = name;
        this.surname = surname;
        this.sesso = sesso;
        this.eta = eta;
        this.sessoBrutale=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getSesso() {
        return sesso;
    }

    public void setSesso(int sesso) {
        this.sesso = sesso;
    }

    @Override
    public String toString() {
        return "Il nome del soggetto e'" + " name=  " + name + ", surname = " + surname + ", eta = " + eta + " sesso = Decisamente pcoo " + "sessoBrutale = NandoSica";
    }
    
    
            
    
    

}
