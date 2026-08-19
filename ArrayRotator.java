public class ArrayRotator {

    public void rotateByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int lastElement = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        ArrayRotator obj = new ArrayRotator();
        obj.rotateByOne(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
