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
    
    public static int SommaDiPiuValori (int[] vect){
        int sum = 0;
        for (int x: vect)
            sum += x;
        System.out.println("Ciao Ragazzi la somma del vettore sarà: " +sum);
        return sum;
    }
    
    
    public static String FunzionediVito(String x){
        String result;
        result=("A " + x + " piacciono i piedi");
        return result;
    }
    
    public String sommiamoTUTTO(String c, String x){
        return c + x;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ciao ragazzi");
        System.out.println("Ciao ragazzi sto testando");
        String x = "Mammacita";
        System.out.println(FunzionediVito(x));
        SommaDiDueValori(5,3);
        int[] v={1,2,3,4};
        SommaDiPiuValori(v);
        SottrazioneaDiDueValori(5,3);
        System.out.println("cazzoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo, se non ti stai fermo ti stacco la testa mangiandomela a morsi");
        
        
        Person nando = new Person("nando" , "sica" , 22 , 0);
        System.out.println(nando);
    
    
    }

}
