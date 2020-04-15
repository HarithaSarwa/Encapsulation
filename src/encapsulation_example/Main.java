package encapsulation_example;

public class Main {

	public static void main(String[] args) {
		Player p = new Player(1, "Haritha", 37);
		System.out.println(p.getName());
		/* To modify or update a player name we use setters */

		Player p1 = new Player(2, "Kalyan", 39);// not using constructor to create a data
		/*
		 * p1.id=2; p1.name="kalyan"; data here is accessed directly which is not good
		 * the data should be in a trackable way .. if not this leads to data leakage
		 * which we have to stop.. this is done by using encapsulation.
		 */
		System.out.println(p1);
		Player p2 = new Player(3, "Abhiram", 4);
		System.out.println(p2);
		Player p3 = new Player();
		System.out.println(p3);
		Player p4 = new Player(5, "Anjana");
		p4.setAge(4);
		System.out.println(p4);
	}

}
