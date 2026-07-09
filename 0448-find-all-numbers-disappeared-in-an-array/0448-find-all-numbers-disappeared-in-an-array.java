class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer>ll=new ArrayList<>();
        Set<Integer>set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                ll.add(i);
            }
        }
        
        return ll;

        
    }
}