import java.lang.Math;

public class WaterContaner{
	static int maxArea(int[] height) {

		if(height.length<2)
			return 0;
		int left=0;
		int right=height.length-1;
		int waterArea =0;
		while(left<=right){
			int temp = (right-left)*Math.min(height[left],height[right]);
			waterArea=Math.max(temp,waterArea);
			if(height[left]<=height[right])
				left++;
			else
				right--;

		}

		return waterArea;
        
    }
    public static void main(String args[]){

    	int height[]={1,8,6,2,5,4,8,3,7};
    	System.out.println("Water Area is: "+maxArea(height));

    }
}