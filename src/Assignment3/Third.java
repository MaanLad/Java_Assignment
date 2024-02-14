package Assignment3;

import java.util.Arrays;

public class Third {
    public static int sockMerchant(int n,int[] ar) {
        int count = 0;
        int temp = 1;
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        for (int i = 0; i < n - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                temp++;
                if(i==n-2){
                    count+=temp/2;
                }
            }
            else {
                count += temp / 2;
                temp = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] pileSocks={10, 20, 20, 10, 10, 30, 50, 10, 20};
        int n=pileSocks.length;
        System.out.println();
        System.out.println(sockMerchant(n,pileSocks));
    }
}

