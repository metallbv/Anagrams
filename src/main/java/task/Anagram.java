package task;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read first string
        System.out.println("Input first string");
        String firstString = scanner.nextLine();

        // Read second string
        System.out.println("Input second string");
        String secondString = scanner.nextLine();

        try {
            if (verifyAnagrams(firstString, secondString))
                System.out.println("Strings " + firstString + " & " + secondString + " are anagrams");
            else
                System.out.println("Strings " + firstString + " & " + secondString + " aren't anagrams");
        } catch (DifferentLengthException e) {
            e.printStackTrace();
        }
    }

    public static Boolean verifyAnagrams(String s1, String s2) throws DifferentLengthException {

        char[] chArr1 = s1.toUpperCase().toCharArray();
        char[] chArr2 = s2.toUpperCase().toCharArray();

        java.util.Arrays.sort(chArr1);
        java.util.Arrays.sort(chArr2);

        //возвращаем отсортированный массив в строку
        String valueOfchar1 = String.valueOf(chArr1);
        String valueOfchar2 = String.valueOf(chArr2);
        valueOfchar1 = valueOfchar1.replaceAll(" ", "");
        valueOfchar2 = valueOfchar2.replaceAll(" ", "");

        if (valueOfchar1.length() != valueOfchar2.length())
            throw new DifferentLengthException(
                    new IllegalArgumentException("String " + s1 + " & " + s2 + " have different length!"));

        return valueOfchar1.equals(valueOfchar2);

    }

}
