import java.util.Arrays;

public class FindRepeatWithoutSort {

    public FindRepeatWithoutSort() {
    }

    //This solution is with sorting array
    public static int findRepeatwithSort(int[] numbers) {

        // find a number that appears more than once

        Arrays.sort(numbers);

        int prev = numbers[0];

        for(int i=1;i<numbers.length;i++){
            if(prev!=numbers[i]){
                prev = numbers[i];
            }else{
                break;
            }
        }

        return prev;
    }



}
