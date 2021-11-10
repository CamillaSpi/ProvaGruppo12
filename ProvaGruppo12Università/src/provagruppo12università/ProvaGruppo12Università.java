/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provagruppo12università;

/**
 *
 * @author t440
 */
public class ProvaGruppo12Università {
    
    
    public static int SommaDiDueValori(int a, int b){
        int tmp = a+b;
        System.out.println("Ciao ragazzi la somma risultate sarà " + tmp);
        return a+b;
    }
    public static int SottrazioneaDiDueValori(int a, int b){
        int tmp = a-b;
        System.out.println("Ciao ragazzi la somma risultate sarà " + tmp);
        return a-b;
    }
    
    
    public static String FunzionediVito(String x){
        String result;
        result=("A " + x + " piacciono i piedi");
        return result;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ciao ragazzi");
        System.out.println("Ciao ragazzi sto testando");
        String x = "Nando";
        System.out.println(FunzionediVito(x));
        SommaDiDueValori(5,3);
        SottrazioneaDiDueValori(5,3);
        System.out.println("cazzoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
    }

}
