package day27;

public class Multi_D_Arrays_Task {

    public static void main(String[] args) {

        int[][] numbers = {{12,11,10,19},{19,20,15}, {100,89,88,7888}};
        int max = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (max < numbers[i][j]){
                    max = numbers[i][j];

                }
            }
        }
        System.out.println("Max # using for loop = " + max);

        int max2 = numbers[0][0];
        for (int[] each1DArray : numbers){
            for (int elements : each1DArray){
                if (max2<elements){
                    max2=elements;

                }

            }
        }
        System.out.println("Max # using for each loop = " + max2);
int min = numbers[0][0];
        //for (int i = 0; i < ; i++) {

        }
    }
