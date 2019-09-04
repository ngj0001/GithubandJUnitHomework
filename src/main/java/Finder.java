public class Finder {

    public static int max(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            throw new IllegalArgumentException();
        }
        int max = intArray[0];
        for (int i: intArray) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static int min(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            throw new IllegalArgumentException();
        }
        int min = intArray[0];
        for (int i: intArray) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}