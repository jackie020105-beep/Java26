package Chapter04;

public class Member {

	private String name;
	private String id;
	private int pw;
	private int age;
	public Member(String name, String id, int pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	public void getName() {
		this.name = name;
	}
	public void getID() {
		this.id = id;
	}
	public void getPW() {
		this.pw = pw;
	}
	public void getAge() {
		this.age = age;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	public void setID(String id) {
		this.id = id;
	}
	public void setPW(int pw) {
		this.pw = pw;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
