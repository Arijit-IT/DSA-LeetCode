class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        //cheak for is 1 present if yes then swap
        Arrays.sort(arr);
        if(arr[0]!=1){
            for(int i=0;i<arr.length;i++){
                if(i==arr.length-1 && arr[i]!=1){
                    arr[0]=1;
                    break;
                }
                if(arr[i]==1){
                    arr[i]=arr[0];
                    arr[0]=1;
                    break;
                }
            }
        }
        for(int i=1;i<arr.length;i++){
            if((Math.abs(arr[i] - arr[i-1]))>1){
                arr[i]=arr[i-1]+1;
            }
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;

    }
}