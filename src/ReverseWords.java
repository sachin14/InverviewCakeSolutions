import java.util.Arrays;

public class ReverseWords {

    public ReverseWords() {
    }

    public  void reverseWords(char[] message) {
       // System.out.println(Arrays.toString(message));
        //Step 1. Reverse the whole char array
        for(int i=0;i<message.length/2;i++){
            char temp = message[i];
            message[i] = message[message.length-1-i];
            message[message.length-1-i] = temp;
        }
        //System.out.println(Arrays.toString(message));
        //Step 2. revers characters of each word

        int startChar = 0;
        boolean firstFound = true;
        for(int i=0;i<message.length;i++){
            if(message[i]!=' ' && !firstFound) {
                startChar = i;
                firstFound = true;

            }
            if(message[i] == ' ' || i == message.length-1){
                int t = 0;
                if(i<message.length)
                     t = i-1+startChar;
                if(i==message.length-1)
                    t = i+startChar;
              //  System.out.println("outside" + " " + startChar + " " + i + " " + t);

                while(startChar<=t/2){
                   // System.out.println(startChar + " " + i);
                    char temp = message[startChar];
                    message[startChar] = message[t-startChar];
                    message[t-startChar] = temp;
                    startChar++;
                }
                firstFound = false;
            }
        }

    }
}
