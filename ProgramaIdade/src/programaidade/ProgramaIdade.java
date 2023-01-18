/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author danillo-nitro-5
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int anoAtual, anoNascimento, idade;
        anoAtual = Year.now().getValue();
        System.out.print("Digite seu ano de nascimento: ");
        anoNascimento = teclado.nextInt();
        idade = anoAtual - anoNascimento;
        System.out.println("Sua idade é: " + idade + ".");
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
    
}
