//https://leetcode.com/problems/determine-if-two-events-have-conflict/description/

//2446. Determine if Two Events Have Conflict
//        Easy
//        Topics
//        Companies
//        Hint
//        You are given two arrays of strings that represent two inclusive events that happened on the same day, event1 and event2, where:
//
//        event1 = [startTime1, endTime1] and
//        event2 = [startTime2, endTime2].
//        Event times are valid 24 hours format in the form of HH:MM.
//
//        A conflict happens when two events have some non-empty intersection (i.e., some moment is common to both events).
//
//        Return true if there is a conflict between two events. Otherwise, return false.
//
//
//
//        Example 1:
//
//        Input: event1 = ["01:15","02:00"], event2 = ["02:00","03:00"]
//        Output: true
//        Explanation: The two events intersect at time 2:00.
//        Example 2:
//
//        Input: event1 = ["01:00","02:00"], event2 = ["01:20","03:00"]
//        Output: true
//        Explanation: The two events intersect starting from 01:20 to 02:00.
//        Example 3:
//
//        Input: event1 = ["10:00","11:00"], event2 = ["14:00","15:00"]
//        Output: false
//        Explanation: The two events do not intersect.
//
//
//        Constraints:
//
//        evnet1.length == event2.length == 2.
//        event1[i].length == event2[i].length == 5
//        startTime1 <= endTime1
//        startTime2 <= endTime2
//        All the event times follow the HH:MM format.


import java.util.Arrays;

public class TwoEventsHaveProblem {

  public static boolean haveConflict(String[] event1, String[] event2) {

      String[] e11 = event1[0].split(":");
      String[] e12 = event1[1].split(":");

      String[] e21 = event2[0].split(":");
      String[] e22 = event2[1].split(":");

      double startTime1 = Integer.parseInt(e11[0]) + (double) Integer.parseInt(e11[1]) / 60;
      double endTime1 = Integer.parseInt(e12[0]) + (double) Integer.parseInt(e12[1]) / 60;

      double startTime2 = Integer.parseInt(e21[0]) + (double) Integer.parseInt(e21[1]) / 60;
      double endTime2 = Integer.parseInt(e22[0]) + (double) Integer.parseInt(e22[1]) / 60;

      if ((startTime1 < startTime2 && endTime1 < startTime2) || startTime2 < startTime1 && endTime2 < startTime1 ){
          return false;

      } else {
          return true;
      }
  }

    public static boolean haveConflict2(String[] event1, String[] event2) {

        double startTime1 = event1[0].charAt(0) * 10 + event1[0].charAt(1) + event1[0].charAt(3) * 0.1 + event1[0].charAt(4) * 0.01;
        double endTime1 = event1[1].charAt(0) * 10 + event1[1].charAt(1) + event1[1].charAt(3) * 0.1 + event1[1].charAt(4) * 0.01;
        double startTime2 = event2[0].charAt(0) * 10 + event2[0].charAt(1) + event2[0].charAt(3) * 0.1 + event2[0].charAt(4) * 0.01;
        double endTime2 = event2[1].charAt(0) * 10 + event2[1].charAt(1) + event2[1].charAt(3) * 0.1 + event2[1].charAt(4) * 0.01;

        if ((startTime2 >= startTime1 && startTime2 <= endTime1) ||
                (startTime2 >= startTime1 && endTime2 <= endTime1) ||
                (startTime2 <= startTime1 && endTime2 >= endTime1)){
            return true;
        } else return false;
    }

  public static void main(String[] args) {

      System.out.println(haveConflict(new String[]{"01:15","02:00"}, new String[]{"02:00","03:00"}));
      System.out.println(haveConflict(new String[]{"01:00","02:00"}, new String[]{"01:20","03:00"}));
      System.out.println(haveConflict(new String[]{"10:00","11:00"}, new String[]{"14:00","15:00"}));
      System.out.println(haveConflict(new String[]{"16:53","19:00"}, new String[]{"10:33","18:15"}));
      System.out.println(haveConflict(new String[]{"02:00","03:00"}, new String[]{"01:00","02:00"}));

      System.out.println(haveConflict2(new String[]{"01:15","02:00"}, new String[]{"02:00","03:00"}));
      System.out.println(haveConflict2(new String[]{"01:00","02:00"}, new String[]{"01:20","03:00"}));
      System.out.println(haveConflict2(new String[]{"10:00","11:00"}, new String[]{"14:00","15:00"}));
      System.out.println(haveConflict2(new String[]{"16:53","19:00"}, new String[]{"10:33","18:15"}));
      System.out.println(haveConflict2(new String[]{"02:00","03:00"}, new String[]{"01:00","02:00"}));

  }
}
