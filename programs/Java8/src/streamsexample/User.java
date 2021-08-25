package streamsexample;

public class User {
	private String name;
	private static int age=30;

	User(String name){
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public  int getAge() {
		return age;
	}


	public static void setAge(int age) {
		User.age = age;
	}


	@Override
	public String toString() {
		return "Name = "+this.name+" age = "+this.age;
	}

}
