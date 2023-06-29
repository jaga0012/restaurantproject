package restaurantproject;
import java.util.Scanner;
public class main {
	Scanner sc=new Scanner(System.in);
	 int choice,Quantity=1;
	 String again;
	 double total=0,Pay;
	public void menu() {
		System.out.println("\t\tTSK HOTAL");
		System.out.println("-_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- -_- ");
		System.out.println("\t WELCOME TO OUR RESTAURANT");
		System.out.println("\tRestaurant Menu");
		System.out.println("\t1.Barger BDT $80.00");
		System.out.println("\t2.Pizza  BDT $100.00");
		System.out.println("\t33.Coffee BDT $60.00");
		System.out.println("\t4Cancel");
		
	}
	public void order() {
		System.out.println("1 to Barger ||2 to Pizza||3 to Coffee");
		System.out.println("Press you want to order:");
		choice=sc.nextInt();
		if(choice==1)
		 {
			System.out.println("you choice Barger");
			System.out.println("how many Barger you to want");
			Quantity=sc.nextInt();
			total=total+(Quantity*80);
			System.out.println("you want to buy again");
			System.out.println("Press Y for[Yes]and N for[No]:");
			again=sc.next();
			if(again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("Enter payment");
				Pay=sc.nextDouble();
				if(Pay<total)
					System.out.println("No,need more");
				else {
					System.out.println("total="+total);
					total=Pay-total;
					System.out.println("Customer'return"+total+"tk");
					
				}
			
			}
		}
		else if(choice==2)
		 {
			System.out.println("you choice Pizza ");
			System.out.println("how many Pizza you to want");
			Quantity=sc.nextInt();
			total=total+(Quantity*100);
			System.out.println("you want to buy again");
			System.out.println("Press Y for[Yes]and N for[No]:");
			again=sc.next();
			if(again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("Enter payment");
				Pay=sc.nextDouble();
				if(Pay<total)
					System.out.println("No,need more");
				else {
					System.out.println("total="+total);
					total=Pay-total;
					System.out.println("Customer'return"+total+"tk");
					
				}
			
			}
		}
		else if(choice==3)
		 {
			System.out.println("you choice coffee");
			System.out.println("how many coffee you to want");
			Quantity=sc.nextInt();
			total=total+(Quantity*60);
			System.out.println("you want to buy again");
			System.out.println("Press Y for[Yes]and N for[No]:");
			again=sc.next();
			if(again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("Enter payment");
				Pay=sc.nextDouble();
				if(Pay<total)
					System.out.println("No,need more");
				else {
					System.out.println("total="+total);
					total=Pay-total;
					System.out.println("Customer'return"+total+"tk");
					
				}
			
			}
		}
		else if(choice==4) {
			System.exit(0);
			}
		else {
			System.out.println("Choose food in this item:");
			order();
			
		}
			
	}

	public static void main(String[] args) {
		main sc=new main();
		sc.menu();
		sc.order();
		// TODO Auto-generated method stub

	}

}
