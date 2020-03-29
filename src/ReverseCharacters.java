public class ReverseCharacters {

    public ReverseCharacters() {
    }

    public  void reverse(char[] arrayOfChars) {

        // reverse input array of characters in place

       for(int i=0;i<arrayOfChars.length/2;i++){
           char temp = arrayOfChars[i];
           arrayOfChars[i] = arrayOfChars[arrayOfChars.length-1-i];
           arrayOfChars[arrayOfChars.length-1-i] = temp;
       }

    }
}
