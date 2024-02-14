package Assignment1;

public class First {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,3};
        int[] temp = new int[a.length];
        int k = 0;


        for (int i=0;i< a.length;i++){
            boolean x =  hasValue(a[i],temp);
            if (x==false){
                temp[i] = a[i];
                k++;
            }
        }

        for(int i=0;i< k;i++){
            System.out.println(temp[i]);
        }
    }

    public static boolean hasValue(int x , int[] temp1){

        for(int i = 0; i < temp1.length ; i++){
            if(x == temp1[i]){
                return true;
            }
        }
        return false;
    }

}