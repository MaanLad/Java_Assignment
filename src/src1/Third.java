package src1;

public class Third {

    public static void printCount(int x, int temp[]){
        int count=0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]==x){
                count++;
            }
        }
        System.out.println("The number "+x+" has frequency :- "+count);
    }
    public static boolean hasValue(int x , int[] temp1){

        for(int i = 0; i < temp1.length ; i++){
            if(x == temp1[i]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,3,4,5};
        int[] temp = new int[arr.length];
        int k = 0;


        for (int i=0;i< arr.length;i++) {
            boolean x = hasValue(arr[i], temp);
            if (x == false) {
                temp[i] = arr[i];
                printCount(temp[i], arr);
                k++;
            }
        }
    }
}
