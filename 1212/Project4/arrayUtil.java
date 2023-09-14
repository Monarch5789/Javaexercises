public class ArrayUtil {
    private int[] intArray;

    public ArrayUtil() { // constructor
        intArray = new int[0];
    }

    public ArrayUtil(int[] arr) { // constructor
        intArray = arr;
    }

    public int[] getArray() { // accessor
        return intArray;
    }

    public void setIntArray(int[] arr) { // Mutator
        intArray = arr;
    }

    public int minValue() { // find the minimum value
        if (intArray.length == 0) { // if the array is empty, it has no minimum value, so we'll call that zero
            return 0;
        }
        int min = intArray[0]; // loop through the array as discussed in the pseudocode
        for (int i=1; i<intArray.length;i++) {
            if(intArray[i]<min){
                min = intArray[i];
            }
        }
        return min; // remember to actually return a value lol
    }

    public int maxValue() { // find the maximum value
        if(intArray.length == 0) { // once again if it's empty, it has no max, so we call it 0
            return 0;
        }
        int max = intArray[0]; // loop as discussed in pseudocode
        for (int i=1;i<intArray.length;i++) {
            if(intArray[i]>max){
                max = intArray[i];
            }
        }
        return max;
    }
    public int countUniqueIntegers(){ // I hate this why does it feel so awkward, is there a better way of doing this?
        if(intArray.length == 0){ // if the array is empty, it has no unique integers
            return 0;
        }
        int count = 1; // loop through as discusssed in pseudocode
        for (int i=1;i<intArray.length;i++){
            int temp;
            for(temp=0;temp<i;temp++){ // here's that second loop
                if(intArray[i] == intArray[temp]){
                    break; // remember to get out if it doesn't pass
                }
            }
            if (i==temp){ // add one to the count if it passes
                count++;
            }
        }
        return count; // return our value
    }


} // we done