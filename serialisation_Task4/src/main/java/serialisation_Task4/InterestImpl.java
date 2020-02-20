package serialisation_Task4;
import java.util.*;
public class InterestImpl {
	public static void main(String [] args) {
		double p,t,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter principle, time and rate of interest");
		p=s.nextDouble();
		t=s.nextDouble();
		r=s.nextDouble();
		Simple_Interest S=new Simple_Interest(p,t,r);
		double si=S.Interest_calculator();
		System.out.println("Simple interest for p:"+p+" t: "+t+" r "+r+" is "+si);
		Compound_Interest C=new Compound_Interest(p,t,r);
		double ci=C.Interest_calculator();
		System.out.println("Compound interest for p:"+p+" t: "+t+" r "+r+" is "+ci);
	}
}
