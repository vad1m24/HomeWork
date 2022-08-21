package lesson9;


public class Main {
    public static void main(String[] args) {
        String[][] array1 = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"1", "2", "3", "4"}, {"5", "6", "7", "8"}};
        String[][] array2 = new String[][]{{"1", "2", "3"}, {"1", "2", "3"}, {"1", "2", "x"}};

        int checkArr = 0;
        try {
            checkArr = checkArr(array2);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }
        System.out.println(checkArr);
    }

    public static int checkArr(String[][] arraySum) throws MyArraySizeException, MyArrayDataException {
        int rows = arraySum.length;
        int columns = arraySum[0].length;
        if (rows != 4 && columns != 4) {
            throw new MyArraySizeException("Неправильный размер массива!");
        }

        int sum = 0;
        for (int i = 0; i < arraySum.length; i++) {
            for (int j = 0; j < arraySum.length; j++) {
                String s = arraySum[i][j];
                try {
                    int parseInt = Integer.parseInt(s);
                    sum += parseInt;
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(e.getMessage());
                }

            }
        }
        return sum;
    }
}
