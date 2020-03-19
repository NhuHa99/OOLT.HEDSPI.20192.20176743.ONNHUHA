package Week2;

public class Debug {
	public static void main(String[] args) {
		Fraction f = new Fraction(3,4);
		Fraction g = new Fraction("1/5");
		Fraction[] myFraction = new Fraction[5];
		 
		Fraction sum = f.add(g);
		
		myFraction[0] =f;
		myFraction[1]= g;
		myFraction[4] = sum;
		
		System.out.println(myFraction[4].toPrettyString());
	}
}


