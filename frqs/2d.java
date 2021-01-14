//Part A:
public static int arraySum(int[] arr) {
    int total = 0;
    for (int x : arr) {
        total += x;
    }
    return total;
}

//Part B:
public static int[] rowSums(int[][] arr) {
    int[] sums = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        int total = 0;
        for (int x : arr[i]) {
            total += x;
        }
        sums[i] = total;
    }
    return sums;
}

//Part C:
public static boolean isDiverse(int[][] arr2D) {

    //Obtains sums array:
    int[] sums = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        int total = 0;
        for (int x : arr[i]) {
            total += x;
        }
        sums[i] = total;
    }

    //Finds unique values:
    List<Integer> unique = new ArrayList<Integer>();
    for (int x :  sums) {
        if (unique.contains(x)) {
            return false;
        }
        unique.add(x);
    }

    return true;
}