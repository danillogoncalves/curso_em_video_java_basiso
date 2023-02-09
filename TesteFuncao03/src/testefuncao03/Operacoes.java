/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testefuncao03;

/**
 *
 * @author danillo-nitro-5
 */
public class Operacoes {
    public static String contador(int inicio, int fim) {
        String s = "";
        for (int count = inicio; count <= fim; count++) {
            s += count + " ";
        }
        return s;
    }
}
