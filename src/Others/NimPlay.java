package Others;

public class NimPlay {
    public static void main(String[] args) {
        int n=8;
        boolean[] ans=new boolean[3];
        if(n%2==1){
            ans[0]=true;
        }else{
            ans[0]=false;
        }
        if(n%4>=1){
            ans[1]=true;
        }else{
            ans[1]=false;
        }
        if(n%6>=1){
            ans[2]=true;
        }else{
            ans[2]=false;
        }
        System.out.println(ans[0]||ans[1] &&ans[2]);
//        return ans[0]||ans[1]||ans[2];
    }
}
