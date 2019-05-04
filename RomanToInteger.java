

public class RomanToInteger{
   static int value(char ch){
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
	static int romanToInt(String s)  {

		if(s.length()<1||s==null)
            return 0;
        if(s.length()==1)
            return value(s.charAt(0));
        int result =0;
        for(int i=0;i<s.length();i++){

            int s1 = value(s.charAt(i));
            if(i+1<s.length()){
                int s2 = value(s.charAt(i+1));
                if(s1>=s2)
                    result+=s1;
                else
                {
                    result+=s2-s1;
                    i++;
                }
            }
            else{
                result+=s1;
                i++;
            }

        }

        return result;
        
    }
    public static void main(String args[]){

    	String n1= "III";
    	String n2 = "IV";
    	String n3 ="IX";
    	String n4 = "LVIII";
    	String n5 = "MCMXCIV";
    	System.out.println("Integer is : "+romanToInt(n1));
    	System.out.println("Integer is : "+romanToInt(n2));
    	System.out.println("Integer is : "+romanToInt(n3));
    	System.out.println("Integer is : "+romanToInt(n4));
    	System.out.println("Integer is : "+romanToInt(n5));
    

    }
}