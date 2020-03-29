import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args){
        //My first programming class
        //My second comment
        System.out.println("My Interview Cake solutions");

        MergeMeetings m = new MergeMeetings();

        List<MergeMeetings.Meeting> meetings = Arrays.asList(
                new MergeMeetings.Meeting(0, 1), new MergeMeetings.Meeting(3, 5), new MergeMeetings.Meeting(4, 8),
                new MergeMeetings.Meeting(10, 12), new MergeMeetings.Meeting(9, 10)
        );

        System.out.println(m.mergeRanges(meetings).toString());

    }

}
