public class HighestProductofThree {

    public HighestProductofThree() {
    }

    /*
    We could have easily sorted the array and then taken top 3 and mulitplied.
    But that solution will be O(n log n) times complex.
    The below solution is O(n) complexity
     */

    public  int highestProductOf3(int[] intArray) {

        //Find first highest of 3
        int highestof3 = intArray[0] * intArray[1] * intArray[2];
        int lowestof3 = intArray[0] * intArray[1] * intArray[2];

        //Find highest of 2
        int highestof2 = intArray[0] * intArray[1];
        int lowestof2 = intArray[0] * intArray[1];

        //find highest and lowest
        int highest = Math.max(intArray[0],intArray[1]);
        int lowest = Math.min(intArray[0],intArray[1]);

        for (int i=2;i<intArray.length;i++){

            int temp = intArray[i];

            highestof3 = Math.max(Math.max(highestof3, temp*highestof2), temp*lowestof2);
            highestof2 = Math.max(Math.max(temp*highest, temp*lowest),highestof2);
            lowestof2 = Math.min(Math.min(temp*highest,temp*lowest),lowestof2);
            highest = Math.max(highest,temp);
            lowest = Math.min(lowest,temp);



        }

        return highestof3;
    }
}
