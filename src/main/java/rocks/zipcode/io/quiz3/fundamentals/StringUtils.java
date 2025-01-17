package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String str2 = "";
        for(int i = 0 ; i <=str.length()-1; i++){
            if(i == indexToCapitalize){
                str2 = str2 + Character.toUpperCase(str.charAt(i));
            } else {
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println(str2);
        return str2;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Boolean isIt = false;
        if(baseString.charAt(indexOfString) == characterToCheckFor){
            isIt = true;
        }

        return isIt;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> list = new HashSet<>();
        for(int i = 0; i<string.length();i++){
            for(int j=i+1; j<=string.length();j++){
                String sub = string.substring(i,j);
                list.add(sub);
            }
        }
        String[] all = new String[list.size()];
        return list.toArray(all);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
