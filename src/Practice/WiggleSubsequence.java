package Practice;

public class WiggleSubsequence {
    public static int wiggleMaxLength(int[] nums) {
        if(nums.length<2)return 1;

        int count=1;
        int prevDiff=0;
        for(int i=1;i<nums.length;i++){
            int diff = nums[i] - nums[i-1];
            // the equals in prevDiff <= 0 && prevDiff >=0 can only be used at the first iteration, otherwise prevDiff will never be zero afterwards
            if((diff>0 && prevDiff <= 0) || (diff<0 && prevDiff >= 0)){
                count++;
                prevDiff = diff;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = {1,7,4,9,2,5};
        System.out.println(wiggleMaxLength(num));
    }
}
