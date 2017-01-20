package temp;

public class TestUpcasting {
	public static void main(String[] args) {
		B b = new B();
		b.setAge(3);
		
		A a = b;  // upcasting
		B b1 = (B) a; // downcasting
		
	    System.out.println(b1.getAge());
	}
}

class A {
	private int id;
	private String name;
	
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
}

class B extends A {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}