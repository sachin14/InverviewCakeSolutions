import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeMeetings {

    public MergeMeetings() {
    }

    public List<Meeting> mergeRanges(List<Meeting> meetings) {


        //sort the meetings by start time

        Collections.sort(meetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                return o1.getStartTime() - o2.getStartTime();
            }
        });

        List<Meeting> mergedMeetings = new ArrayList<>();
        mergedMeetings.add(meetings.get(0));

        for (Meeting meeting : meetings) {

            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

            if (meeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
                lastMergedMeeting.setEndTime(Math.max(meeting.getEndTime(), lastMergedMeeting.getEndTime()));
            } else {
                mergedMeetings.add(meeting);
            }

        }
        return mergedMeetings;
    }


        //This class provided as-is by the Question
        public static class Meeting {

            private int startTime;
            private int endTime;

            public Meeting(int startTime, int endTime) {
                // number of 30 min blocks past 9:00 am
                this.startTime = startTime;
                this.endTime = endTime;
            }

            public int getStartTime() {
                return startTime;
            }

            public void setStartTime(int startTime) {
                this.startTime = startTime;
            }

            public int getEndTime() {
                return endTime;
            }

            public void setEndTime(int endTime) {
                this.endTime = endTime;
            }

            @Override
            public boolean equals(Object o) {
                if (o == this) {
                    return true;
                }
                if (!(o instanceof Meeting)) {
                    return false;
                }
                final Meeting meeting = (Meeting) o;
                return startTime == meeting.startTime && endTime == meeting.endTime;
            }

            @Override
            public int hashCode() {
                int result = 17;
                result = result * 31 + startTime;
                result = result * 31 + endTime;
                return result;
            }

            @Override
            public String toString() {
                return String.format("(%d, %d)", startTime, endTime);
            }
        }


}
