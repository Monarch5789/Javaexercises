public class Main {
    public static void main(String[] args){
        int[] numbers01 = {4,10,7,1,18};
        selectionSort(numbers01);
        //System.out.println(numbers01);
        System.out.print(numbers01[0]);
        System.out.print(" ");
        System.out.print(numbers01[1]);
        System.out.print(" ");
        System.out.print(numbers01[2]);
        System.out.print(" ");
        System.out.print(numbers01[3]);
        System.out.print(" ");
        System.out.print(numbers01[4]);

    }

    public static void selectionSort(int numbers []) {
        int indexSmallest = 0;
        int temp = 0; // temporary variable for swap

        for(int i=0; i < numbers.length - 1; i++){
            // Find index of smallest remaining element
            indexSmallest = i;
            for(int j=i + 1; j < numbers.length; ++j){
                if(numbers[j] < numbers[indexSmallest]){
                    indexSmallest = j;
                }
            }
            if(indexSmallest != i){
            // Swap numbers i and numbers smallestindex
            temp = numbers[i];
            numbers[i] = numbers[indexSmallest];
            numbers[indexSmallest] = temp;
            }
        }
    }
}
