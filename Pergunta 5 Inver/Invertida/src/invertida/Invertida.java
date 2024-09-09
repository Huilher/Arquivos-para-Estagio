
package invertida;

import java.util.Scanner;


public class Invertida {

  
    public static void main(String[] args) {
       // Scanner para leitura da entrada do usu�rio
        Scanner inver = new Scanner(System.in);
        
        // Solicitar ao usu�rio para inserir a string
        System.out.print("Digite uma string para inverter: ");
        String input = inver.nextLine();
        
        // Fechar o scanner
        inver.close();
        
        // Inverter a string
        String reversed = inverterString(input);
        
        // Exibir a string invertida
        System.out.println("String invertida: " + reversed);
    }

    // M�todo para inverter os caracteres da string
    public static String inverterString(String str) {
        // Criar um array de caracteres com o mesmo comprimento da string
        char[] caracteres = new char[str.length()];
        
        // Percorrer a string do final para o in�cio e preencher o array
        for (int i = 0; i < str.length(); i++) {
            caracteres[i] = str.charAt(str.length() - 1 - i);
        }
        
        // Criar uma nova string a partir do array de caracteres
        return new String(caracteres);
    }
    
}
