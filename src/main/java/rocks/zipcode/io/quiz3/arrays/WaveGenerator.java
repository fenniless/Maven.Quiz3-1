package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] strArray = new String[str.length()];
        String stringLower = str.toLowerCase();
        int indexToUppercase = 0;
        for(int i=0; i<str.length();i++){

            for(int j = 0; j<str.length();j++){

                if(indexToUppercase==i){
                    String newString = uppercaseAtIndex(stringLower,i);
                    stringLower = newString;
                    indexToUppercase++;
                }
            }

            strArray[i] = stringLower;

        }

        System.out.println(Arrays.toString(strArray));
        return strArray;
    }

    public static String uppercaseAtIndex(String str, int index){

        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(index == i){
                charArray[i] += Character.toUpperCase(charArray[index]);
            }
        }
        //Character.toUpperCase(charArray[index]);
        return String.valueOf(charArray);

    }
}
