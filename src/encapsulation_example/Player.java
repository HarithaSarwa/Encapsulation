package encapsulation_example;

public class Player {

	private int id;
	private String name;
	private int age;

	public Player() {

	}
	

	public Player(int id, String name) {
		
		this.id = id;
		this.name = name;
	}


	public Player(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

//	public String toString() {
//		String s = "Id = " + id + ", Name = " + name + ", Age = " + age;
//		return s;     
//	}
}
//Object.java is a paren of all java classes