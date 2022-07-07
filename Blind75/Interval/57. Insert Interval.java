/*
You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

 

Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
Example 2:

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 

Constraints:

0 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 105
intervals is sorted by starti in ascending order.
newInterval.length == 2
0 <= start <= end <= 105
*/

public int[][] insert(int[][] intervals, int[] newIntercals) {
    // define list
    List<int[]> list = new LinkedList<>();

    // 1. add all intervals that are non-overlapping to the newInterval
    int i = 0, n = intervals.length;
    while(i < n && intervals[i][1] < newInterval[0]) {
        list.add(interval[i]); 
    }

    // 2. merge newinterval with the overlapping interval
    while(i < n && intervals[i][0] <= newInterval[1]) {
        newInterval[0] = Math.min(newInterval[0], interval[i][0]);
        newInterval[1] = Math.max(newInterval[1], interval[i][1]);
        i++;
    }

    // 3. add all the remaining intervals to the list
    while(i < n) {
        list.add(intervals[i++]); 
    }

    // return list
    return list.toArray(new int[list.size()][2];
}
