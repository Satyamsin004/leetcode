class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int length1 = ax2 - ax1;
        int breadth1 = ay2 - ay1;
        int length2 = bx2 - bx1;
        int breadth2 = by2 - by1;

        int area1 = length1 * breadth1;
        int area2 = length2 * breadth2;

        boolean xoverlap = ax1 < bx2 && ax2 > bx1;
        boolean yoverlap = ay1 < by2 && ay2 > by1;
        int overlaparea = 0;

        if (xoverlap && yoverlap) {
            int overlaplength = Math.min(ax2, bx2) - Math.max(ax1, bx1);
            int overlapbredth = Math.min(ay2, by2) - Math.max(ay1, by1);
            overlaparea = overlaplength * overlapbredth;

        }
        return area1 + area2 - overlaparea;

    }
}