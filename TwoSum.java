public class TwoSum {
    int left, right;
    public int[] findTwoSum(int [] nums, int target){
        int n = nums.length;
        left = 0;
        right = n-1;

            while(left<right){
                if(nums[left]+nums[right]==target){
                    return new int[] {left, right};
                }
                if(nums[left]+nums[right] > target){
                    right--;
                }
                if(nums[left]+nums[right]<target){
                    left++;
                }
            }

        return new int []{};
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        System.out.println("The two indices which give sum as target=9 are as follows..");
        int [] output = new int [2];
        TwoSum obj = new TwoSum();
        output = obj.findTwoSum(nums, 9);
        for(int num : output){
        System.out.println( "  "+num);
        }
    }
}
