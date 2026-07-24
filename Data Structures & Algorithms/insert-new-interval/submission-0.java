class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0], end = newInterval[1];
        boolean inserted = false;
        var ans = new ArrayList<int[]>();
        for(int[] i : intervals) {
            if(start > i[1]) {
                ans.add(i);
            }else if(i[0] > end) {
                if(!inserted) {
                    ans.add(new int[]{start, end});
                    inserted = !inserted;
                }
                ans.add(i);
            }else {
                start = Math.min(start, i[0]);
                end = Math.max(end, i[1]);
            }
        }
        if(!inserted) {
            ans.add(new int[] {start, end});
        }
        return ans.toArray(new int[0][]);
    }
}
