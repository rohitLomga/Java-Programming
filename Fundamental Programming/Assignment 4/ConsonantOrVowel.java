package Assignment4;

import java.util.Scanner;

public class ConsonantOrVowel {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the any string");
        String input = scanner.nextLine();

        String intoLowerCase = input.toLowerCase();
        int countVowel = 0;
        int countConsonant = 0;

        for(int i = 0; i < intoLowerCase.length(); i++){
            char ch = intoLowerCase.charAt(i);
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    countVowel++;
                }else {
                    countConsonant++;
                }
            }
        }
        scanner.close();
        System.out.println("Number of vowels in the string : " + countVowel);
        System.out.println("Number of consonants in the string : " + countConsonant);
    }
}
