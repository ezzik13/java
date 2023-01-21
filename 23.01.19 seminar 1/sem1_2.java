// Дан массив nums = [3,2,1,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
// [2,2,1,3,3] new int[]
/**
 * sem1_2
 */
public class sem1_2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 2, 3};
        int val = 3;
        int count = 0;
        if (nums[nums.length-1] == val)
                count++;
        for (int i = nums.length-2; i >= 0; i--) {
            
            if (nums[i] == val) {
                count++;
                int temp = nums[i];
                nums[i] = nums[nums.length - count];
                nums[nums.length - count] = temp;
                
            }
        }
        for (var el : nums){
            System.out.print(el + " ");
        }
    }
}
