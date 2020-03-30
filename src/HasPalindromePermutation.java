import java.util.HashMap;
import java.util.Map;

public class HasPalindromePermutation {

    public HasPalindromePermutation() {
    }

    public  boolean hasPalindromePermutation(String theString) {

        // check if any permutation of the input is a palindrome
        boolean isPalindrome = true;

        if(theString.length()<3)
            return true;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<theString.length();i++){
            char c = theString.charAt(i);
            if(map.containsKey(c)){
                int temp = map.get(c);
                map.replace(c,++temp);
            }else{
                map.put(c,1);
            }
        }

        int oddCount = 0;
        for(Map.Entry mp: map.entrySet()){

            if((int)mp.getValue() == 1 || (int)mp.getValue()%2 == 1){
               oddCount++;
            }
        }

        if(oddCount>1)
            isPalindrome = false;

        return isPalindrome;
    }
}
