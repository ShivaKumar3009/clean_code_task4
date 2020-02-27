package House_construction;
import java.util.*;

public class House_main {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		
		
		while (true){
			System.out.println("Enter area of house");
			int house_area=s.nextInt();
			double cost;
			System.out.println("Enter material type (INTEGER)");
			System.out.println("\n1.Standard\n2.AboveStandard\n3.HighStandard\n4.HighStandardandAutomated\n5.exit\n");
			int material=s.nextInt();
			House h=new House(material);
			
			switch(material) {
			
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
			case 5: return;
				
			default: System.out.println("No such material\nEnter again\n");
				 break ;
			}
		}
		
		
	}
}
