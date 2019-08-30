public class Finder {
    public int max;
    public int min;

    public Integer findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        } else {
            max = intArray[0];

            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] > max) {
                    max = intArray[i];
                }

            }
            return max;

        }


    }
    public Integer findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        else
            min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min){
                min = intArray[i];

            }
        }
        return min;

    }





}
