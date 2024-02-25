package Others;

public class NimPlay {
    public static void main(String[] args) {
        int n=8;
        boolean[] ans=new boolean[3];
        ans[0]= n % 2 == 1;
        ans[1]= n % 4 >= 1;
        ans[2]= n % 6 >= 1;
        System.out.println(ans[0]||ans[1] &&ans[2]);
//        return ans[0]||ans[1]||ans[2];
    }
}
