public class ProductsofAllExceptIndex {

    public ProductsofAllExceptIndex() {
    }

    public  int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

        // make an array of the products

        int[] arrayofall = new int[intArray.length];



        //calculate product forward
        int productsofar = 1;
        for(int i=0;i<intArray.length;i++){
            arrayofall[i] = productsofar;
            productsofar = productsofar * intArray[i];
        }

        //calculate backward array
        productsofar = 1;
        for(int i=intArray.length-1;i>=0;i--){
            arrayofall[i] = arrayofall[i] * productsofar;
            productsofar = productsofar * intArray[i];
        }
        //done

        return arrayofall;
    }
}
