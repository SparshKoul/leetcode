class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] >= lastEnd) {//two intervals touching at their endpoints are NOT considered overlapping here 
                count++;
                lastEnd = intervals[i][1];
            }
            
        }

        return intervals.length-count;
    }
}