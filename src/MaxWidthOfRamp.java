public class MaxWidthOfRamp {
    public int maxWidthRamp(int[] nums) {
        int l=0;
        int r=0;
        int res=Integer.MIN_VALUE;
        for(r=0;r<nums.length;r++){
            if(nums[l]>nums[r]){
                l++;
            }
            res=Math.max(res,r-(l+1));
        }
        res=Math.max(res,r-(l+1));
        System.out.println("The res-"+res);
        return 0;
    }
}
