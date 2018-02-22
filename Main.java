import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListData{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int option;
		int value;
		ArrayList<Integer> elementData = new ArrayList<Integer>();

		do{
			System.out.println("Option Menu:");
			System.out.println("1. Put X at the end of ArrayList");
			System.out.println("2. Remove all Y's from ArrayList");
			System.out.println("3. Print the size of ArrayList");
			System.out.println("4. Exit and end program");

			System.out.print("Enter one of the options: ");
			option = scan.nextInt();

			switch(option){
				case 1:
					System.out.println("Enter number for the of end ArrayList: ");
					elementData.add(elementData.size(), scan.nextInt());
					break;
				case 2:
					System.out.println("Enter a number to remove from ArrayList: ");
					value = scan.nextInt();
					for(int i=0;i<elementData.size();i++){
						if(elementData.get(i) == value){
							elementData.remove(i);
						}
					}
					break;
				case 3:
					System.out.println("The size of ArrayList is: " + elementData.size());
					break;
				case 4:
					System.out.println("Thank you for using this program!");
					break;
				default:
					System.out.println("Invalid command. Please try again.");
			}
			System.out.println("");
		}while(option != 4);
		scan.close();
	}
}
