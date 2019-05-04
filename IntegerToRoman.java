

public class IntegerToRoman{
	static String intToRoman(int num)  {

		String M[] = {"","M","MM","MMM"};
		String C[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String I[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

		String thousands= M[num/1000];
		String hunderds = C[(num%1000)/100];
		String tens = X[(num%100)/10];
		String ones = I[num%10];





		return thousands+hunderds+tens+ones;
        
    }
    public static void main(String args[]){

    	int n1= 3;
    	int n2 = 4;
    	int n3 =9;
    	int n4 = 58;
    	int n5 = 1994;
    	int test =0;
    	System.out.println("Romsn Numeral is: "+intToRoman(n1));
    	System.out.println("Romsn Numeral is: "+intToRoman(n2));
    	System.out.println("Romsn Numeral is: "+intToRoman(n3));
    	System.out.println("Romsn Numeral is: "+intToRoman(n4));
    	System.out.println("Romsn Numeral is: "+intToRoman(n5));
    	System.out.println("Romsn Numeral is: "+intToRoman(test));

    }
}