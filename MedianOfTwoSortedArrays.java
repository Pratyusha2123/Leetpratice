public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merge = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                merge[k++] = nums1[i++];
            else
                merge[k++] = nums2[j++];
        }

        while (i < nums1.length)
            merge[k++] = nums1[i++];

        while (j < nums2.length)
            merge[k++] = nums2[j++];

        int n = merge.length;

        if (n % 2 == 0)
            return (merge[n / 2] + merge[n / 2 - 1]) / 2.0;

        return merge[n / 2];
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
