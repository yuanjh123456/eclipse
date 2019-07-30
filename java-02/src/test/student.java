package test;

public class student implements Comparable{
	private String name;
	private int age;
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		System.out.println("asdasd");
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((address == null) ? 0 : address.hashCode());
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("asdasdasdas");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public student(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public int compareTo(Object o) {
		return 1;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
