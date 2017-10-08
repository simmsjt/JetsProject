package Jets;

public class Pilot {
	private String name;
	private int id;
	private int age;
	private int yearsExperience;
	
	Pilot(String name){
		this(name,0,0,0);
	} 
	
	public Pilot(String name, int id, int age, int yearsExperience) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.yearsExperience = yearsExperience;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}
	
	
}
