class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int left=0,right=0,count=1;
        arr[0]=nums[0];
        while(right<n){
        // if(nums[left]==nums[right])
        // {
        //     right++;
        // }
        // else
        if(nums[left]!=nums[right])
        {
            arr[count]=nums[right];
            count++;
            left=right;
           
        }
        right++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        return count;
    }
        
    
}