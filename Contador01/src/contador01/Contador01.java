/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author danillo-nitro-5
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int count = 0;
        while (count < 20) {
            System.out.println("Cambalhota " + ++count);
        }*/
        /*int count = 0;
        while (count < 10) {
            count++;
            if (count == 5 || count == 7 || count == 9) {
                continue;
            }
            System.out.println("Cambalhota " + count);
        }*/
        int count = 0;
        while (count < 10) {
            count++;
            if (count == 2 || count == 3 || count == 4) {
                continue;
            }
            if (count == 7) {
                break;
            }
            System.out.println("Cambalhota " + count);
        }
    }
    
}
