class Solution {
    public long sumAndMultiply(int n) {
        int sum=0;
        String str = String.valueOf(n);
        str = str.replace("0", "");
        if(str.length()>0){
        for(int i=0;i<str.length();i++){
            sum+=str.charAt(i)-'0';
        }
        int num = Integer.parseInt(str);
        long ans = (long) num * sum;
        return ans;
        }
        else return 0;

    }
}