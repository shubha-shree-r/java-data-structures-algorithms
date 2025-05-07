package problemSolving.easy;

import java.util.Arrays;

public class ArrayEquals {
    int[] inputArray1 = {1, 2, 3, 4};
    int[] inputArray2 = {1, 2, 3, 4};
    int[] arrayMax = {20,30,40,50,60};


    public ArrayEquals() {
        this.inputArray1 = inputArray1;
        this.inputArray2 = inputArray2;
        this.arrayMax = arrayMax;
    }

    public boolean arrayEquals(int[] inputArray1, int[] inputArray2) {
        for (int i = 0; i < inputArray1.length; i++) {
            if (inputArray1[i] == inputArray2[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean isArrayEqual(int[] inputArray1, int[] inputArray2){
        return Arrays.equals(inputArray1,inputArray2);
    }

    public int getArrayMax(int[] arrayMax){
        int max = arrayMax[0];
        for(int num : arrayMax){
            if(num > max){
                max = num;
            }

        }
        return max;
    }


    public static void main(String[] args) {
        ArrayEquals arrayProgram = new ArrayEquals();

        System.out.println("The given arrays are equal : " + arrayProgram.arrayEquals(arrayProgram.inputArray1, arrayProgram.inputArray2));
        System.out.println("Default method : " + arrayProgram.isArrayEqual(arrayProgram.inputArray1, arrayProgram.inputArray2));

        System.out.println("Array maximum : " + arrayProgram.getArrayMax(arrayProgram.arrayMax));
    }
}
