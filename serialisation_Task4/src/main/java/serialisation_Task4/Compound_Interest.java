package serialisation_Task4;


public class Compound_Interest extends Simple_Interest {
		Compound_Interest(double p,double t,double r){
			super(p,t,r);
		}
		double Interest_calculator() {
			double Ci;
			Ci=(p*(Math.pow(1+r/100, t)))-p;
			return Ci;
		}
}
