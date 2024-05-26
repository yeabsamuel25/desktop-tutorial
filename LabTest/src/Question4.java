public class Question4 {
    public static void main(String[] args) {
            int[] my_array = {1,2,3,4,5};
            int maxVal = my_array[0];

            for (int i : my_array) {
                if (i > maxVal) {
                    maxVal = i;
                }
            }

            System.out.println("Maximum value: " + maxVal);
        }
    }


