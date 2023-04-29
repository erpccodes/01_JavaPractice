package recurssion;

public class XtoThePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int power=6;
		System.out.println(powerCal(x,power));
	}
		public static int powerCal(int x,int power) {
			if(power==0) {
				return 1;
			}if(x==0)
				return 0;
			int prod=x*powerCal(x,power-1);;
			return prod;
			
		}
}
