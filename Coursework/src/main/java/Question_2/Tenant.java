package Question_2;

public class Tenant implements ITenant {

	private String forename;
	private String surname;
	private int age;
	private TenantType type;

	public Tenant(String forename, String surname, int age, TenantType type) {
		String regularExpression = "[A-Z][a-z]+";
		if (forename == null || surname == null || age == 0) {
			throw new NullPointerException();
		}
		if (age <= 16) {
			throw new IllegalArgumentException("Tenant is not old enough");
		}
		if (forename.matches(regularExpression) != true || surname.matches(regularExpression) != true) {
			throw new IllegalArgumentException();
		}
		this.forename = forename;
		this.surname = surname;
		this.age = age;
		this.type = type;
	}

	@Override
	public int getAge() {
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