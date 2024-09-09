
package fibonacci;

import java.util.Scanner;

public class Fibonacci {
   public static void CheckFibo(int number) {
        int a = 0, b = 1;

        while (b < number) {
            int next = a + b;
            a = b;
            b = next;
        }

        if (b == number || number == 0) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
    }
   
    public static void main(String[] args) {
        Scanner Fibo = new Scanner(System.in);
        System.out.print("Informe um número: ");
        
        int number = Fibo.nextInt();
       Fibo.close();

        CheckFibo(number);
    }
}