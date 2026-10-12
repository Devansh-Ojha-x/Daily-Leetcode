class Solution {
    public int findMin(int[] arr) {
        int right=arr.length-1;
        int left=0;
        int mid=0;
        while(right>left){
            mid=left+(right-left)/2;
            if(arr[right]<arr[mid]){
                left=mid+1;
            }
            else right=mid;
        }
        return arr[left];
    }
}