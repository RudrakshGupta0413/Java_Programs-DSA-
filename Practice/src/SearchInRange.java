public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 10;
        System.out.println(search(arr, target, 1, 5));
    }
    static int search(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }

        for(int i = start; i <= end; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }   


}