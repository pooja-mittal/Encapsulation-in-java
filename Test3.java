class Employee
{
	private String name;
	private int id;

	public void setName(String name) {
		this.name=name;
	}

	public void setId(int id) {
		this.id=id;
	}

	public void getName()
	{
		System.out.println("name " + name);
		return;
	}

	public void getId() {
		System.out.println("id " + id);
		return;
	}
}

class Test
{
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("pooja");
		e.setId(23);
		e.getName();
		e.getId();
	}
}