class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []arr =new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++){
            arr[k]=nums[i];
            k=k+1;
            arr[k]=nums[i+n];
            k=k+1;
        }
        return arr;
    }
}