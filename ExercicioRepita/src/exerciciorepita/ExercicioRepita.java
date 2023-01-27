/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author danillo-nitro-5
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, par = 0, impar = 0, contagem = 0, acimaDeCem = 0;
        double m; 
        do {
            n = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        null,
                        "<html>Informe um número: <br/><em>(Valor 0 interrompe)</em></html>",
                        "Entrada de Dados",
                        JOptionPane.QUESTION_MESSAGE
                )
            );
            if (n % 2 == 0 && n != 0) par++;
            if (n % 2 != 0 && n != 0) impar++;
            if (n > 100) acimaDeCem++;
            if (n != 0) contagem++;
            s += n;
        } while (n != 0);
        m = (double) s / (double) contagem;
        JOptionPane.showMessageDialog(null, "<html><em>Resultado final</em><br/><br/><hr>"
                + "Total de valores:  <b>" + contagem + "</b><br/>"
                + "Total de pares:  <b>" + par + "</b><br/>"
                + "Total de ímpares:  <b>" + impar + "</b><br/>"
                + "Acima de 100:  <b>" + acimaDeCem + "</b><br/>"
                + "Média dos valores:  <b>" + (m) + "</b></html>",
                "Resultado final",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
