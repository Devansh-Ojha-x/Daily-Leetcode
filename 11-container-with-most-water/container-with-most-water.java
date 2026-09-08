class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxw=0;

        while(l<r){
            int h=Math.min(height[l],height[r]);
            int b = r-l;
            int area=b*h;
            maxw=Math.max(maxw,area);

            if(height[l]<height[r]){
                l++;
            }
            else r--;
        }
        return maxw;
    }
}