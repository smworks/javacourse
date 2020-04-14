public class Task {
    public static int findMaxNumber(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }
}