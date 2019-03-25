package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] stringArray = str.split(" ");
        String newString = "";
        if(stringArray.length >1 ) {
            for (int i = 0; i < stringArray.length; i++) {
                if (checkFirstLetterForVowel(stringArray[i])) {
                    newString = newString+ addWay(stringArray[i]);
                    newString = newString + " ";
                } else {
                    newString = newString+ constAdd(stringArray[i]);
                    newString = newString + " ";
                }
            } return newString.trim();
        }
        if (checkFirstLetterForVowel(str)) {
            return addWay(str);
        }
        return constAdd(str);
    }

    public String addWay(String str) {
        return str + "way";
    }

    public String constAdd(String str) {
        int firstVowelIndex = firstVowelIndex(str);
        return str.substring(firstVowelIndex, str.length()) + str.substring(0, firstVowelIndex) + "ay";
    }

    public Integer firstVowelIndex(String str) {
        int firstVowelIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            //i know this is shit code, but i cant call on the vowelUtils for some reason
            if (str.substring(i, i + 1).equals("a") || str.substring(i, i + 1).equals("e") ||
                    str.substring(i, i + 1).equals("i") || str.substring(i, i + 1).equals("o") || str.substring(i, i + 1).equals("u")) {
                firstVowelIndex = i;
                break;
            }
        }
        return firstVowelIndex;

    }

    public Boolean checkFirstLetterForVowel(String str) {
        if (Character.toString(str.charAt(0)).equals("e") || Character.toString(str.charAt(0)).equals("a")
                || Character.toString(str.charAt(0)).equals("i") || Character.toString(str.charAt(0)).equals("o") || Character.toString(str.charAt(0)).equals("u")) {
            return true;
        }
        return false;
    }
}
