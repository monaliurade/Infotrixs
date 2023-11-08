package Java_Task;
//real time currency converter system using java
	//it allows users to add,view favorite currency list
	//Use a option to show the favorite currency
		import java.util. ArrayList;
		import java.util.Scanner;
public class Task1 {
	
		
			public static ArrayList<String> Currency = new ArrayList<>();
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				boolean running = true;
				
				
			while (running)	{
				System.out.println("options:");
				System.out.println("1.Add currency to favorites");
				System.out.println("2.View  favorite currencies");
				System.out.println("3.Convert Currency");
				System.out.println("4.Exist");
				System.out.println("select an option:");
				
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					addCurrency();
					break;
				case 2:
					ViewCurrency();
					break;
				case 3:
					currencyConversion();
					break;
				case 4:running = false;
				System.out.println("Existing...");
				break;
				default:
					System.out.println("Invalid option.please choose a valid option.");
				
				}
					
				}
			}
			public static void currencyConversion() {
				System.out.println("1 Ruppe");
				System.out.println("2 Doller");
				System.out.println("3 Euro");
				
				Scanner Sc = new Scanner (System.in);
				System.out.println("choose the currency");
				int choise = Sc.nextInt();
				System.out.println("Enter the amount");
				double amount = Sc.nextDouble();
				
				
				switch(choise) {
				case 1:
					rupeeToother(amount);
				break;
				case 2:
					dollarToOther(amount);
				break;
				case 3:
					euroToOther(amount);
					break;
					default:
						System.out.println("Invalid choice");
				}
				
			}
			
			public  static void addCurrency() {
				Scanner Sc = new Scanner (System.in);
				String choice = Sc.next();
				Currency.add(choice);
				System.out.println(choice + "added to favorites.");
				
				
			}
			public static void ViewCurrency() {
				if (Currency.isEmpty()) {
					System.out.println("You havent added any favorite currencies yet.");
				}else {
					System.out.println("Favorite currencies:");
					for(String currency : Currency) {
						System.out.println(currency);
					}
				}
			}
			
			
			public  static void rupeeToother(double amt) {
				System.out.println("1 Ruppe = 0.013 Dollar");
				System.out.println();
				System.out.println(amt + "Ruppe = " + (amt * 0.013) + "Dollar");
				System.out.println();
				System.out.println("1 Ruppe - 0.012 Euro");
				System.out.println();
			}
			
			
			public static void dollarToOther(double amt) {
				System.out.println("1 Dollar = 79.37 Ruppe");
				System.out.println();
				System.out.println(amt + "Dollar="+(amt * 79.37 ) + "Ruppe");
				System.out.println();
				System.out.println("1 Dollar = 0.98 Euro");
				System.out.println();
				System.out.println(amt +"Dollar =" + (amt*0.98) + "Euro");
			}
			public static void euroToOther(double amt) {
				System.out.println("1 Euro = 80.85 Ruppe");
				System.out.println();
				System.out.println(amt + "Euro="+(amt * 80.85) + "Ruppe");
				System.out.println();
				System.out.println("1 Euro - 1.02 Dollar");
				System.out.println();
				System.out.println(amt + "Euro =" +(amt *1.02)+"Dollar");
				
			}
			
				
			}

				
				
				
				
				
				
				
			



