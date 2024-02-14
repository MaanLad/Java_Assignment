package Assignment1;

//Java Program to Remove Duplicate Elements From the Array
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] arr={1,2,4,4,4,3,3,3};
        int[] arr1=new int[arr.length];
        int value=0;
        int size=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j=i;j<arr.length;j++){
//                System.out.println(arr[j]);
                if(arr[i]==value){
                    continue;
                }else{
                    if(arr[i]==arr[j]){
                        arr1[size]=arr[i];
                        value=arr[i];
                        size++;
                    }else{
                        arr1[size]=arr[i];
                        size++;
                    }
                }
                }
            arr[i]=value;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr1[i]);
        }
    }
    }