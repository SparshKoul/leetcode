class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); //asc order start
        ArrayList<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= end) {//merge cond (new intvel first with old intv last )
                end = Math.max(end, intervals[i][1]);
            } else {
                res.add(new int[] { start, end });
                start = intervals[i][0];
                end = intervals[i][1];
            }

        } // add final merged intrvl
        res.add(new int[] { start, end }); //last final values of start end that did not got considerd as loop ended
        
        return res.toArray(new int[res.size()][]);//2d arrr

    }
}