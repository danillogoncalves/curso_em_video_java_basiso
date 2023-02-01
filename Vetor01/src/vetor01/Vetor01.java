/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

import java.time.Year;

/**
 *
 * @author danillo-nitro-5
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n[] = new int[4];*/
        boolean isYearLeap = Year.now().isLeap();
        int n[] = {3,2,8,7,5,4};
        System.out.println(isYearLeap);
        System.out.println("Total de casas de 'N' = " + n.length + ".");
        /*for (int c = 0; c <= 5; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c] + ".");
        }*/
        for (int c = 0; c < n.length; c++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c] + ".");
        }
        String mes[] = {
            "Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
            "Jul", "Ago", "Set", "Out", "Nov", "Dez"
        };
        Integer tot[] = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        Integer totLeap[] = {
            31, 29, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        for (int i = 0; i < mes.length; i++) {
            if (isYearLeap) {
                System.out.println(mes[i] + " tem " + totLeap[i] + " dias.");
            } else {
                System.out.println(mes[i] + " tem " + tot[i] + " dias.");
            }
        }
    }
    
}
