package Jets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {
	public static List<Jet> fleet = new ArrayList<Jet>();
	public static String[] names = new String[] {"Chris","Jake","Rob","Steve","Jason","Dave","Hunter"};
	
	
	public static void main(String[] args) {
		populateFleet();
		runLoop();
		
		//runLoop();
	}
	
	public static void printMenu() {
		System.out.println("-------------");
		System.out.println("1. List fleet");
		System.out.println("2. View fastest jet");
		System.out.println("3. View jet with longest range");
		System.out.println("4. Add a jet to Fleet");
		System.out.println("5. Quit");
		System.out.println("-------------");
	}
	
	public static void runLoop() {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		int choice = 0;
		
		
		while(loop) {
			printMenu();
			System.out.print("Please enter the number of you selection:");
			choice = sc.nextInt();
			methodRun(choice);
			if(choice == 5) {
				System.out.println("System quitting.");
				loop = false;
			}
				
		}
		
	}
	
	public static void populateFleet() {
		fleet.add(new Jet(pilotGenerator(), "Hawk", 800, 452.1, "8/21/17",6_000_000));
		fleet.add(new Jet(pilotGenerator(), "Valkyre", 314, 542.5, "2/24/17",700_000));
		fleet.add(new Jet(pilotGenerator(), "SpitFire", 520, 722, "4/12/17",7_000_000));
		fleet.add(new Jet(pilotGenerator(), "Burrito", 412, 6345.65, "2/2/17",347_013));
		fleet.add(new Jet(pilotGenerator(), "Timbuck2", 123, 441.92, "1/7/17",190_000));
	}
	
	public static void listFleet() {
		Object [] fleetArray =  fleet.toArray();
		for(int i =0; i < fleetArray.length; i++) {
			System.out.print("The " +
		((Jet) fleetArray[i]).getModel() + " jet piloted by " + ((Jet) fleetArray[i]).getPilot().getName());
			System.out.println("\nhas a range of " + ((Jet) fleetArray[i]).getRange() + " \nand a speed of "
		+ ((Jet) fleetArray[i]).getSpeed() + " \nand a price of " + ((Jet) fleetArray[i]).getPrice() + "\n");
		}
	}
	
	public static void viewFastestJet() {
		int mSIndex = 0; //max speed index
		
		for(int i = 0; i<fleet.size(); i++) {
			if(fleet.get(mSIndex).getSpeed()<fleet.get(i).getSpeed())
				mSIndex = i;
		}
		System.out.println("The fastest jet in the fleet is: ");
		System.out.print("The " +
		fleet.get(mSIndex).getModel() + 
		" jet piloted by " + 
		fleet.get(mSIndex).getPilot().getName());
		System.out.println("\nhas a range of " + 
		fleet.get(mSIndex).getRange() + 
		" \nand a speed of " +
		fleet.get(mSIndex).getSpeed() + 
		" \nand a price of " + 
		fleet.get(mSIndex).getPrice() + "\n");
		printPilot(fleet.get(mSIndex).getPilot());
	}
	
	public static void viewLongestRangeJet() {
		int lRIndex = 0; //max speed index
		
		for(int i = 0; i<fleet.size(); i++) {
			if(fleet.get(lRIndex).getRange()<fleet.get(i).getRange())
				lRIndex = i;
		}
		System.out.println("The longest flying jet in the fleet is: ");
		System.out.print("The " +
		fleet.get(lRIndex).getModel() + 
		" jet piloted by " + 
		fleet.get(lRIndex).getPilot().getName());
		System.out.println("\nhas a range of " + 
		fleet.get(lRIndex).getRange() + 
		" \nand a speed of " +
		fleet.get(lRIndex).getSpeed() + 
		" \nand a price of " + 
		fleet.get(lRIndex).getPrice() + "\n");
		printPilot(fleet.get(lRIndex).getPilot());
	}
	
	public static void addJet() {
		Scanner ki = new Scanner (System.in);
		System.out.print("Please enter new jet's speed:");
		double speed = ki.nextDouble();
		System.out.print("Please enter new jet's model:");
		String model = ki.next();
		System.out.print("Please enter new jet's range:");
		double range = ki.nextDouble();
		System.out.print("Please enter new jet's last maintance date:");
		String lastMaintance = ki.next();
		System.out.print("Please enter new jet's price:");
		int price = ki.nextInt();
		
		fleet.add(new Jet(pilotGenerator(), model, speed, range, lastMaintance, price));
		System.out.println("\n" + fleet.get(fleet.size()-1).getModel() + " jet has been added");
	}
	
	public static void printPilot(Pilot p) {
		System.out.println(p.getName() +" is the pilot.\nHe is " + p.getAge() +
				" years old his id is "+ p.getId() + ".\nHe has been working for " + p.getYearsExperience());
	}
	
	
	public static Pilot pilotGenerator() {
		String name = names[(int)(Math.random() * 6)];
		int id = (int)(Math.random() * 400) + 3;
		int age = (int)(Math.random() * 55) + 21;
		int yearsExperience = (int)(Math.random() * 25) + 1;
		return new Pilot(name, id, age, yearsExperience);
	}
	
	
	
	public static void methodRun(int choice) {
		//runs method based on selection
		switch(choice) {
			case 1:	listFleet();
					break;
			case 2: viewFastestJet();
					break;
			case 3: viewLongestRangeJet();
					break;
			case 4: addJet();
					break;
		}
	}
	
	
	
}
