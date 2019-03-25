package rocks.zipcode.io.quiz3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        Arrays.sort(array);
        for(int i =0 ; i < array.length ; i++){
            if(getNumberOfOccurrences(array[i])%2!=0) {
                return array[i];
            }
        }
        return array[array.length-1];
    }

    public SomeType findEvenOccurringValue() {
        if(getNumberOfOccurrences(array[0])%2==0){
            return array[0];
        }
        return array[array.length-1];
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            SomeType current = array[i];
            if (current == valueToEvaluate)
            {
                count++;
            }
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> filtered = new ArrayList<>();
        for(SomeType type : array){
            if(predicate.apply(type)){
                filtered.add(type);
            }
        }
        SomeType[] newArray = Arrays.copyOf(array,filtered.size());
        return filtered.toArray(newArray);
    }
}
