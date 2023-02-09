/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao02;

/**
 *
 * @author danillo-nitro-5
 */
public class TesteFuncao02 {

    /**
     * @param args the command line arguments
     */
    
    static String soma(int num1, int num2) {
        int result = num1 + num2;
        return "A soma é " + result + ".";
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou a soma.");
        System.out.println(soma(5, 2));
    }
    
}
