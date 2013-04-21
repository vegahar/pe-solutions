
class Rational{
	public int nominator;
	public int denominator;
	
	public Rational(int a, int b){
		nominator = a;
		denominator = b;
	}
	
	public String toString(){
		return nominator + "/" + denominator;
	}
}
public class Problem72 {

		
	public static void main(String[] args) {
	
		Rational a = new Rational(3, 9);
		System.out.println(a.toString());
		a= hcd(a);
		System.out.println(a.toString());
		
		
	}
	
	
	public static Rational hcd(Rational a){
		int gcd = gcd(a.denominator, a.nominator);
		return new Rational(a.nominator/gcd, a.denominator/gcd);
	}
	public static int gcd(int a, int b){
		if(a <b){
			int temp = a;
			a=b;
			b=temp;
		}
		if(b==0){
			return a;
		}
		
		return gcd(b,a%b);
	}
}





