package Others;

public class ContainerWithWater {

    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int i=0;
        int j=height.length-1;
        int maxArea=0;
        while(i<j){
            int width=j-i;
            int area=Math.min(height[i],height[j])*width;
            maxArea=Math.max(maxArea,area);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        System.out.println(maxArea);
    }
}
