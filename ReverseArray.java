import java.util.Scanner;;
public class ReverseArray{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for(int i=0; i<n; i++){
            int num=arr[i];
            int reversed=0;
            while(num!=0){
                int digit=num%10;
                reversed=reversed*10+digit;
                num=num/10;
            }
            arr[i] = reversed;
        }

        System.out.println("Array with reversed elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("The rversed array is: ");
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        for(int i=0; i<n; i++){
            System.out.println("\n"+ arr[i]+ " ");
        }


    }
}