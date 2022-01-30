public class Task6 {
    public static void main(String[] args) {
        System.out.println("среднее " + average(new int[]{-3, 4, 6, 7, 0}));
        System.out.println("максимальное число " + max(new int[]{-3, 4, 6, 7, 0}));
    }

    //Task 6
    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (double) sum / array.length;
    }


    public static int max(int[] array) {
        int maxvalue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxvalue)
                maxvalue = array[i];
        }
        return maxvalue;
    }
}
