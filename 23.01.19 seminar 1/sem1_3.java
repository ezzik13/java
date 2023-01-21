import java.util.Random;

public class sem1_3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
           array[i] = random.nextInt(2);
        }
        for (var el : array){
            System.out.print(el + " ");
        }
        int count = 0;
        int maxCount = 0;
        int x = 1;
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            if (array[j] == x)
                count++;
            else if(array[j] != x){
                if (maxCount<count)
                    maxCount = count;
                count = 0;}
            if (j == array.length-1){
                System.out.print("максимальная последовательность единиц равна ");
                System.out.print(maxCount);}
            

        }
        System.out.println();
        int count1 = 0;
        int count0 = 0;
        int maxCount2 = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == x){
                count1++;
                if (maxCount2 < count0)
                    maxCount2 = count0;
                count0 = 0;
            }
            else if(array[j] != x){
                count0++;
                if (maxCount2 < count1)
                    maxCount2 = count1;
                count1 = 0;

            }
                
            if (j == array.length-1){
                System.out.print("максимальная последовательность равна ");
                System.out.print(maxCount2);}
            

        }
    }
}