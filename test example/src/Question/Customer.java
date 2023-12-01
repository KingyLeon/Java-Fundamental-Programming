package Question;

public class Customer {

    private String forename = null; //store firstname
    private String surname =null; // Store surname

    // Initialise Question.Customer object
    public Customer(String forename, String surname){
        super();
        this.forename = forename;
        this.surname = surname;
    }
    // Retrieve value of Forename
    public String getForename() {
        return this.forename;
    }
    // Retrieve value of Surname
    public String getSurname(){
        return this.surname;
    }
}
