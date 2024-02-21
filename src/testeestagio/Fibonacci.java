
package testeestagio;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            num = scanner.nextInt();
        }

        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (b < num) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == num;
    }
}