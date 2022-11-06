public class ThirdPart {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 1, 2, 2, 5, 3, 2, 2, 3, 4};
        int[] arr3 = getDivider(arr1, arr2);
        for (int i: arr3)
            System.out.println(i);
    }

    public static int[] getSubstraction(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            throw new RuntimeException("Длинна массивов не совпадают");
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr1[i] - arr2[i];
        return arr;
    }

    public static int[] getDivider(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length)
            throw new RuntimeException("Длинна массивов не совпадают");
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr.length; i++) {
            int min = Integer.min(arr1[i], arr2[i]);
            for (int j = min; j > 0; j--) {
                if ((double) arr1[i] % j == 0 && (double) arr2[i] % j == 0) {
                    arr[i] = j;
                    break;
                }
            }
        }
        return arr;
    }
}
