
package testeestagio;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        String str;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma string para inverter: ");
            str = scanner.nextLine();
        }

        String invertedStr = invertString(str);
        System.out.println("String invertida: " + invertedStr);
    }

    public static String invertString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}
