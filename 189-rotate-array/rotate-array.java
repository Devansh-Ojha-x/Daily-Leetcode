class Solution {
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[(i+k)%n]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}