class Encap
{
	private String name;
	private String id;
	private int age;

	public void setName(String n)
	{
		name=n; 		
	}

	public void setId(String id) {
		this.id=id;
	}

	public void setAge(int age) {
		this.age=age;
	}

	public String getName()
	{
		return name;
	}

	public String getId()
	{
		return id;
	}

	public int getAge()
	{
		return age;
	}
}

	class Test1
	{
		public static void main(String[] args) 
		{
			Encap e=new Encap();
			e.setName("pooja");
			e.setId("1234poo");
			e.setAge(24);
			//e.getName();
			//e.getId();
			//e.getAge();
			System.out.println(e.getName() + " "  + e.getId() + " " + e.getAge());
		}
	}


