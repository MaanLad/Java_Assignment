package src2;

public class ShiftArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int d=3;
        int temp=0;
        System.out.println("Before shift :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < d; i++) {
            temp=arr[0];
            for (int j = 0; j < arr.length-1; j++) {
             arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println("\nAfter shift :- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
