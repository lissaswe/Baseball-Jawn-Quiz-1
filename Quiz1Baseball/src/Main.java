import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		System.out.println("Name?");
		String Name = keys.nextLine();
		System.out.println("Hits?");
		int Hits = keys.nextInt();
		System.out.println("At Bat?");
		int Bats = keys.nextInt();
		System.out.println("Walks?");
		int Walks = keys.nextInt();
		System.out.println("Hits by Pitch?");
		int HBP = keys.nextInt();
		System.out.println("Sacrifice Flys?");
		int Flies = keys.nextInt();
		System.out.println("Doubles?");
		int Doubles = keys.nextInt();
		System.out.println("Triples?");
		int Triples = keys.nextInt();
		System.out.println("Homeruns?");
		int HR = keys.nextInt();
		
		BaseballPlayer BRuth = new BaseballPlayer(Hits,Bats,Walks,HBP,Flies,Doubles,Triples,HR);
		
		//BaseballPlayer BRuth = new BaseballPlayer(2873, 8399, 2062, 43, 0, 506, 136, 714);
		System.out.println("Statistics for " + Name);
		System.out.println("Hits: " + Hits);
		System.out.println("At Bats: " + Bats);
		System.out.println("Walks: " + Walks);
		System.out.println("Hits by Pitch: " + HBP);
		System.out.println("Sacrifice Flies: " + Flies);
		System.out.println("Doubles: " + Doubles);
		System.out.println("Triples: " + Triples);
		System.out.println("Homeruns: " + HR);
		System.out.println("Batting Average: " + BRuth.getBA());
		System.out.println("OBP: " + BRuth.getOBP());
		System.out.println("SLG: " + BRuth.getSLG());
		System.out.println("OPS: " + BRuth.getOPS());
		System.out.println("TB: " + BRuth.getTB());
		
	}

}
