public class Demo2 {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
        }
    }

    public static void xx(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void tk(int n, int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (n == arr[i]){
                System.out.println( "số được tìm thấy ở vị trí " + i + " ,"  + arr[i]);
                break;
            }
        }
    }

    public static int binarySearch(int[] arr, int low, int high, int value){
        if (high > low){
            int mid = low + (high - low) / 2;
            if (arr[mid] == value){
                return mid;
            } else if (arr[mid] > value){
                return binarySearch(arr, low, mid -1, value);
            } else {
                return binarySearch(arr, mid + 1, high, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 7, 4, 8, 90, 34, 0};

        bubbleSort(arr);

        xx(arr);

//        tk(0, arr);

        System.out.println(binarySearch(arr, arr[0], arr.length, 7));
    }
}
