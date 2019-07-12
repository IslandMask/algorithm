public class LeetCode_169_36 {

    public static void main(String[] args) {
        int[] nums = {8,9,8,9,9,8,9,8,8};
        System.out.println(majorityElement(nums));;
    }

    public static int majorityElement(int[] nums) {
        int count = 1;
        Integer candidate = nums[0];
        for (int i = 1; i < nums.length ; i++) {

            /* 说人话的注释
              if (nums[i]==candidate){
                  count = count+1;
                }else {
                   count = count-1;
                }
             */

            count += (nums[i] == candidate)? 1 : -1;
            if (count ==0){
                try{
                    candidate =nums[i+1];
                }catch(Exception e){
                    System.out.println("该数组不满足众数定义（数组越界）");
                }
            }
        }
        return candidate;
    }
}
