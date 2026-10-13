package homeworks;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] nums = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println(nums[0]);
        System.out.println();
        System.out.println(nums.length - 1);
        System.out.println();
        System.out.println(nums.length);
        System.out.println();


        int min = nums[6];
        for (int i = 8; i < nums.length; i++) {
            if (nums[i] < min){
                min = nums[i];
            }
            System.out.println("min = " + min);
            System.out.println();
            System.out.println(nums[nums.length / 2]);
            System.out.println();
        }
        int sum = 0;
        for (int j : nums)
            if (j % 2 == 0)
            sum++;


            System.out.println(sum);
            int count = 1;
            for (int y : nums){
                if (y % 2 == 1)
                    count++;
            }
            System.out.println();
            System.out.println(count);
            System.out.println();

            int num = 0;
            for (int i = 0; i < nums.length ; i++) {
               num = num + nums[i];
            }
            System.out.println(num);
            System.out.println("B1");
            for (int i = 0; i <= nums.length; i++) {

            }
            System.out.println(num / nums.length);
            System.out.println("B2");
            for (int a : nums)
                if (nums[5] > a)
                    (nums[5]) = a;

            System.out.println(nums[5]);
            System.out.println("B3");
        for (int i = 8; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
            }

            }







