public class PeakElement {
    public static void main(String[] args) {
        int[] array = {5, 10, 20, 15};
        int peak = findPeakElement(array);
        System.out.println("Peak Element is: " + peak);
    }

    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        return findPeakUtil(nums, 0, n - 1, n);
    }

    private static int findPeakUtil(int[] arr, int low, int high, int n) {
        int mid = low + (high - low) / 2;

        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
            return arr[mid];
        }

       
        else if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return findPeakUtil(arr, low, mid - 1, n);
        }

        else {
            return findPeakUtil(arr, mid + 1, high, n);
        }
    }
}