/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repeticaofroaninhado;

/**
 *
 * @author danillo-nitro-5
 */
public class RepeticaoFroAninhado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 3; i +=1) {
            for (int j = 0; j <= 2; j += 2) {
                System.out.println(i + " e " + j);
            }
        }
    }
    
}
