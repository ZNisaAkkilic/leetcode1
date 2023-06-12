public class Solution {
    public int FindMin(int [] nums){
        var left =0;
        var right=nums.length-1;
        while (left< right)
        {
            var middle=left +(right-left)/2;
            if(nums[middle]> nums[right]){
                left=middle+1;
            }else{
                right=middle;
            }
        }
        return nums[left];
    }
}
