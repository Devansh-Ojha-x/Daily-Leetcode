class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;
        int nsr[]=new int[heights.length];
        int nsl[]=new int[heights.length];

        //find nsl:
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            };

            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }

            s.push(i);
        }



        //find nsr:
        s=new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            };

            if(s.isEmpty()){
                nsr[i]=heights.length;
            }
            else{
                nsr[i]=s.peek();
            }

            s.push(i);
        }



        //now find the area by comparing them:
        for(int i=0;i<heights.length;i++){
            int w=nsr[i]-nsl[i]-1;
            int h = heights[i];
            int currArea=h*w;

            maxarea=Math.max(currArea,maxarea);
        }

        return maxarea;

    }
}