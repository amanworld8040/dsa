public class maxSubArray {
    public static void main(String[] args) {
        int [] arr ={-2,-3,4,-1,-2,1,5,-3};
        int result=maxArray(arr);
        System.out.println("max sum of the sub array is: "+result);
    }


    public static int maxArray(int [] nums){
        int curMax=Integer.MIN_VALUE;
        int maxAdd=0;

        for (int i = 0; i <nums.length; i++) {
            maxAdd += nums[i];

            curMax=Math.max(curMax,maxAdd);

            maxAdd=Math.max(maxAdd,0);

        }
        return curMax;
    }
}
