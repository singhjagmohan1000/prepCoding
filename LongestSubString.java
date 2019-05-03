import java.lang.Math;
public class LongestSubString{

	static int lengthOfLongestSubstring(String s){

		if(s==null || s.length()==0)
			return 0;
		if(s.length()==1)
			return 1;
		int result =1;
		for(int i=0, j=1;j<s.length();j++){
			int len = 0;
			char ch = s.charAt(j);
			if(s.indexOf(ch,i)<j){
				i = s.indexOf(ch,i)+1;
			}
			len = j - i + 1;
			result = Math.max(result,len);
		}
		return result;
	}

	public static void main(String args[]){

		String a = "abcabcbb";
		String b = "bbbbb";
		String c = "pwwkew";
		String d ="";
		String e = "a";
		String f = "ab";

		System.out.println(lengthOfLongestSubstring(a));
		System.out.println(lengthOfLongestSubstring(b));
		System.out.println(lengthOfLongestSubstring(c));
		System.out.println(lengthOfLongestSubstring(d));
		System.out.println(lengthOfLongestSubstring(e));
		System.out.println(lengthOfLongestSubstring(f));
		System.out.println(lengthOfLongestSubstring(null));
		



	}
}