package lesson3;

import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {
        constractArray();
        bigArray();
        multipleTwo();
        diagonalArray();
        givenArray(9, 5);
        minAndMaxArray(5);
        System.out.println(equalitySum(new int[]{1, 5, 3, 2, 4, 5, 2}));
        moveingArr((new int[5]), -7);
    }

    //Task8.1
    private static void moveingArr(int[] mArr, int n) {
        int a = 1;
        mArr[0] = a;
        int b = 2;
        mArr[1] = b;
        int c = 3;
        mArr[2] = c;
        int d = 4;
        mArr[3] = d;
        int e = 5;
        mArr[4] = e;
        System.out.println(Arrays.toString(mArr));
        System.out.println("Производим смещение на n элементов");
        int diff;
        if ((0 + n) < mArr.length && (0 + n) > 0) {
            mArr[0 + n] = a;
        } else {
            diff = ((0 + n) % mArr.length) * (-1);
            if (diff<0){
                diff = diff * (-1);
            }
            if (diff>mArr.length){
                diff = diff%mArr.length;
            }
            mArr[diff] = a;
        }
        if ((1 + n) < mArr.length && (1 + n) > 0) {
            mArr[1 + n] = b;
        } else {
            diff = ((1 + n) % mArr.length) * (-1);
            if (diff<0){
                diff = diff * (-1);
            }
            if (diff>mArr.length){
                diff = diff%mArr.length;
            }
            mArr[diff] = b;
        }
        if ((2 + n) < mArr.length && (2 + n) > 0) {
            mArr[2 + n] = c;
        } else {
            diff = ((2 + n) % mArr.length) * (-1);
            if (diff<0){
                diff = diff * (-1);
            }
            if (diff>mArr.length){
                diff = diff%mArr.length;
            }
            mArr[diff] = c;
        }
        if ((3 + n) < mArr.length && (3 + n) > 0) {
            mArr[3 + n] = d;
        } else {
            diff = ((3 + n) % mArr.length) * (-1);
            if (diff<0){
                diff = diff * (-1);
            }
            if (diff>mArr.length){
                diff = diff%mArr.length;
            }
            mArr[diff] = d;
        }
        if ((4 + n) < mArr.length && (4 + n) > 0) {
            mArr[4 + n] = e;
        } else {
            diff = ((4 + n) % mArr.length) * (-1);
            if (diff<0){
                diff = diff * (-1);
            }
            if (diff>mArr.length){
                diff = diff%mArr.length;
            }
            mArr[diff] = e;
        }
        System.out.println(Arrays.toString(mArr));
    }


    //Task8
  /*  private static void moveingArr(int[] mArr, int n) {
        for (int i = 0; i < mArr.length; i++) {
            int movArr = mArr[i];
            int sum = i + n;
            if(sum < mArr.length) {
                mArr[sum] = movArr;
            } else {
                int j = sum - mArr.length;
                mArr[j] = movArr;
            }
            }
            System.out.println(Arrays.toString(mArr));
    }*/

    //Task7
    private static boolean equalitySum(int[] arr) {
        int firstSum = 0;
        int secondSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sumOfNumOne = firstSum + arr[i];
            firstSum = sumOfNumOne;
        }
        for (int i = 0; i < arr.length; i++) {
            int sumOfNumTwo = secondSum + arr[i];
            secondSum = sumOfNumTwo;
            if ((firstSum - secondSum) == secondSum) {
                System.out.println(secondSum);
                System.out.println(firstSum);
                return true;
            }
        }
        return false;
    }

    //Task6
    private static void minAndMaxArray(int n) {
        int[] arrData = new int[n];
        for (int i = 0; i < arrData.length; i++) {
            arrData[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arrData));
        int minArr = arrData[0];
        int maxArr = arrData[0];
        for (int i = 1; i < arrData.length; i++) {
            if (arrData[i] < minArr) {
                minArr = arrData[i];
            }
            if (arrData[i] > maxArr) {
                maxArr = arrData[i];
            }
        }
        System.out.println("minArr = " + minArr);
        System.out.println("maxArr = " + maxArr);
    }

    //Task5
    private static int[] givenArray(int len, int initialValue) {
        int[] lenArr = new int[len];
        for (int i = 0; i < lenArr.length; i++) {
            lenArr[i] = initialValue;
        }
        System.out.println(Arrays.toString(lenArr));
        return lenArr;
    }

    //Task4
    private static void diagonalArray() {
        int[][] diagArr = new int[6][6];
        int a = diagArr.length - 1;
        int w = 1;
        for (int i = 0; i < diagArr.length; i++) {
            for (int j = 0; j < diagArr[i].length; j++) {
                if (i == j) {
                    diagArr[i][j] = w;
                } else if (j == a) {
                    diagArr[i][j] = w;
                    a--;
                }
                System.out.printf("%2s ", diagArr[i][j]);
            }
            System.out.println();
        }
    }

    //Task3
    private static void multipleTwo() {
        int[] multArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < multArr.length; i++) {
            int n = multArr[i];
            if (n < 6) {
                multArr[i] = n * 2;
            }
        }
        System.out.println(Arrays.toString(multArr));
    }

    //Task2
    private static void bigArray() {
        int[] bigArray = new int[100];
        int x = 1;
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = x++;
            System.out.printf("%3s ", bigArray[i]);
        }
        System.out.println();
    }

    //Task1
    private static void constractArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}




