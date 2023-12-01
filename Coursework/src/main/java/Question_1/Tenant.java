package Question_1;

public class Tenant implements ITenant {

	private String forename;
	private String surname;
	private int age;
	private TenantType type;

	public Tenant(String forename, String surname, int age, TenantType type) {
		this.forename = forename;
		this.surname = surname;
		this.age = age;
		this.type = type;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public String getName() {
		String output = (forename + " " + surname);
		return output;
	}

	@Override
	public TenantType getType() {
		// TODO Auto-generated method stub
		return this.type;
	}
}
