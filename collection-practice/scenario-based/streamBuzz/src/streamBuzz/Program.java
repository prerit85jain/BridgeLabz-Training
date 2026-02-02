package streamBuzz;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class Program {
	private static Scanner in = new Scanner(System.in);
	
	public static List<CreatorStats> engagementBoard = new ArrayList<>();
	
	public void registerCreator(CreatorStats record) {
		engagementBoard.add(record);
		System.out.println("Creator registered successfully");
	}
	
	public Dictionary<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold){
		Dictionary<String, Integer> dict = new Hashtable<>();
		
		for(CreatorStats record : records){
			int count = 0;
			for(double likes : record.weeklyLikes) {
				if(likes >= likeThreshold) {count++;}
			}
			if(count>0) {
				dict.put(record.creatorName, count);
			}
		}
		
		return dict;
	}
	
	public double CalculateAverageLikes() {
		double total = 0;
		for(CreatorStats record : engagementBoard) {
			for(double likes : record.weeklyLikes) {
				total += likes;
			}
		}
		return total/(engagementBoard.size()*4);
	}
	
	private static void displayOptions() {
		System.out.println("\nSelect Option:");
		System.out.println("1. Register Creator");
		System.out.println("2. Show Top Posts");
		System.out.println("3. Calculate Average Likes");
		System.out.println("4. Exit");
		System.out.println("Enter your choice:");
	}
	
	public static void main(String[] args) {
		boolean run = true;
		Program utility = new Program();
		while(run) {
			displayOptions();
			int option = in.nextInt();
			in.nextLine();
			switch(option) {
				case 1 -> {
					System.out.println("Enter Creator Name:");
					String name = in.nextLine();
					
					double[] weeklyLikes = new double[4];
					System.out.println("Enter weekly likes (Week 1 to 4):");
					for(int i=0; i<4; i++) {
						weeklyLikes[i] = in.nextDouble();
					}
					
					utility.registerCreator(new CreatorStats(name, weeklyLikes));
				}
				case 2 -> {
					System.out.println("Enter like threshold:");
					double likeThreshold = in.nextDouble();
					Dictionary<String, Integer> dict = utility.GetTopPostCounts(engagementBoard, likeThreshold);
					
					if(dict.isEmpty()) {System.out.println("No top-performing posts this week");}
					for(var entry : ((Hashtable<String, Integer>)dict).entrySet()) {
						System.out.println(entry.getKey() + " - " + entry.getValue());
					}
				}
				case 3 -> {
					System.out.println(utility.CalculateAverageLikes());
				}
				case 4 -> {
					System.out.println("Logging off — Keep Creating with StreamBuzz!");
					run = false;
				}
				default -> {
					System.out.println("Try Again.");
				}
			}
		}
		in.close();
	}
}
