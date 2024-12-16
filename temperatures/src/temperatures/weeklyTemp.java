package temperatures;
import java.util.Scanner;
public class weeklyTemp {
	
	

	public static void main(String[] args) {
		
		//Arrays to store Temps
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		float[] temps = {64, 56, 70, 74,78, 90, 75};
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		while (true){
			//Prompts user for day
			System.out.print("Enter day of the week: ");
			String dayOfWeek = input.nextLine();
			
			//checks if user entered week
			if (dayOfWeek.equals("week")) {
				//declare total variable for average calculation later
				float total = 0;
				//iterate through each array printing day/temp
				for (int p = 0; p < days.length; p++) {
					
					System.out.println(days[p] + ": " + temps[p]);
					//calculate and print average
					total += temps[p];
					
				}
				float average = (total / temps.length);
				System.out.printf("The weekly average is: %.2f%n", average, " degrees.");
				
				
			} else {
			//loop to iterate through array "days" and check for match
				for (int i = 0; i < days.length; i++){
				
					if (days[i].equals(dayOfWeek)) {
						System.out.println("The temperature for " + dayOfWeek + " is " + temps[i]);
			
						break;
					
					} 
				}
			}
			
			
			
			
			
			
			
		}
		
		
		
		

	}

}
