package House_construction;
import java.util.*;

public class House_main {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter material type");
		System.out.println("\n1.Standard\n2.AboveStandard\n3.HighStandard\n4.HighStandardandAutomated");
		String material=s.next();
		System.out.println("Enter area of house");
		int house_area=s.nextInt();
		double cost;
		House h=new House(material);
		int type = 0;
		if (!(material =="Standard"))
			 type=1;
		else if (!(material =="AboveStandard"))
			 type=2;
		else if (!(material =="HighStandard"))
			 type=3;
		else if (!(material =="HighStandardandAutomated"))
			 type=4;
				
			switch(type) {
			
			case 1: cost=1200*house_area;
					System.out.println("cost of house construction :"+cost);
					break;
			case 2: cost=1500*house_area;
					System.out.println("cost of house construction :"+cost);
					break;
			
			case 3: cost=1800*house_area;
					System.out.println("cost of house construction :"+cost);
					break;
			
			case 4: cost=2500*house_area;
					System.out.println("cost of house construction :"+cost);
					break;
				
			default: System.out.println("No such material");
					 System.out.println("\n1.Standard\n2.AboveStandard\n3.HighStandard\n4.HighStandardandAutomated");
						break ;
			}
		
		
	}
}
