import java.util.Map;
import java.util.HashMap;
import java.lang.Integer;
public class TwoSum{

		static int[] twoSum(int a[], int target){
			int result[] = new int[2];
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			map.put(target-a[0],0);
			for(int i=1;i<a.length;i++){
				if(map.containsKey(a[i])){
					result[0]=map.get(a[i]);
					result[1]=i;
					break;
				}
				else{
					map.put(target-a[i],i);
				}
			}
			return result;
		}
		public static void main(String args[]){
			int a[]={4,0,2,7,3};
			int target = 9;
			int b[]=twoSum(a,target);
			for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
			}
		}
}