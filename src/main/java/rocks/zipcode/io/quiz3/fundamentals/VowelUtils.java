package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
    public static Boolean hasVowels(String word) {
        for(int i =0;i<word.length();i++){
            char z = word.charAt(i);
            if(vowels.contains(z)){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for(int i = 0 ; i<word.length(); i++){
            char z = word.charAt(i);
            if(vowels.contains(z)){
                return i;
            }
        }
        return -1;
    }

    public static Boolean startsWithVowel(String word) {
        char z = word.charAt(0);
        if(vowels.contains(z)){
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        char z = character;
        if(vowels.contains(z)){
            return true;
        }
        return null;
    }
}
