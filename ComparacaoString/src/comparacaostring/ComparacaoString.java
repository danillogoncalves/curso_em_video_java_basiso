/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author danillo-nitro-5
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String nome4 = nome1 + nome2;
        // Concatenar Strings é igual a instanciar o objeto String.
        String nome5 = "GustavoGustavo";
        String res;
        
        /*res = (nome1 == nome2) ? "igual" : "diferente";
        System.out.println(res);*/
        
        /*res = (nome1 == nome3) ? "igual" : "diferente";
        System.out.println(res);*/
        
        /*res = (nome1.equals(nome3)) ? "igual" : "diferente";
        System.out.println(res);*/
        
        res = (nome4 == nome5) ? "igual" : "diferente";
        System.out.println(res);
        System.out.println(nome4);
        System.out.println(nome5);
    }
    
}
