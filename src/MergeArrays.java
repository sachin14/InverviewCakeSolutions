public class MergeArrays {

    public MergeArrays() {
    }

    public int[] mergeArrays(int[] myArray, int[] alicesArray) {

        // combine the sorted arrays into one large sorted array

        //create a merged array

        int[] mergedArray = new int[myArray.length + alicesArray.length];

        if(myArray.length<1)
            return alicesArray;
        if(alicesArray.length<1)
            return myArray;

        //get the lowest element from zeroth index
        int lower = 0;
        int m=0;
        int a = 0;
        if(myArray[0]<alicesArray[0]) {
            lower = myArray[0];
            m++;
            mergedArray[0] = lower;
        }
        else {
            lower = alicesArray[0];
            a++;
            mergedArray[0] = lower;
        }

        for(int i=1;i<mergedArray.length;i++){

            if(m>myArray.length-1 && a<=alicesArray.length-1 ){
                mergedArray[i] = alicesArray[a];
                a++;
            }
            if(a>alicesArray.length-1 && m<=myArray.length-1){
                mergedArray[i] = myArray[m];
                m++;
            }
            if(m<=myArray.length-1 && a<=alicesArray.length-1) {
                if (myArray[m] < alicesArray[a]) {
                    mergedArray[i] = myArray[m];
                    m++;
                } else {
                    mergedArray[i] = alicesArray[a];
                    a++;
                }
            }
        }

        return mergedArray;
    }
}
