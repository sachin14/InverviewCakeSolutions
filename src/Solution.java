import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public static void main(String[] args){
        //My first programming class
        //My second comment
        System.out.println("My Interview Cake solutions");

        //Start Merge Meetings Solution
        MergeMeetings m = new MergeMeetings();

        List<MergeMeetings.Meeting> meetings = Arrays.asList(
                new MergeMeetings.Meeting(0, 1), new MergeMeetings.Meeting(3, 5), new MergeMeetings.Meeting(4, 8),
                new MergeMeetings.Meeting(10, 12), new MergeMeetings.Meeting(9, 10)
        );

        System.out.println(m.mergeRanges(meetings).toString());
        //End Merge meetings ///

        //Start Reverse words Solution

        ReverseWords rv = new ReverseWords();
        String s = "";
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        rv.reverseWords(arr);
        System.out.println(Arrays.toString(arr));

        //End Reverse Words

        //Start Merge arrays

        MergeArrays ma = new MergeArrays();
        final int[] myArray = {2, 4, 6};
        final int[] alicesArray = {1, 3, 7};
        System.out.println(Arrays.toString(ma.mergeArrays(myArray, alicesArray)));

        //End merge arrays

        //Start Is First come first served

        IsFirstComeFirstServed ifcfs = new IsFirstComeFirstServed();
        final int[] takeOutOrders = {};
        final int[] dineInOrders = {2, 3, 6};
        final int[] servedOrders = {2, 3, 6};
        System.out.println(ifcfs.isFirstComeFirstServed(takeOutOrders,dineInOrders,servedOrders));

        //End Is First come first served

        //Start Twomovies lengths
        TwoMovieLengths tw = new TwoMovieLengths();

        System.out.println("Movie Lengths: " + tw.canTwoMoviesFillFlight(new int[] {1, 2, 3, 4, 5, 6}, 7));
        //End Twomovies lengths

        //Start Has Palindrome Permutation

        HasPalindromePermutation hp = new HasPalindromePermutation();

        System.out.println(hp.hasPalindromePermutation("civic"));

        //End Has Palindrome Permutation

        //Start Apple stock
        AppleStock a = new AppleStock();

        System.out.println(a.getMaxProfit(new int[] {7, 2, 8, 9}));
        //End Apple Stock

        //Start Highest of 3
        HighestProductofThree h3 = new HighestProductofThree();
        System.out.println(h3.highestProductOf3(new int[] {-5, -1, -3, -2}));

    }

}
