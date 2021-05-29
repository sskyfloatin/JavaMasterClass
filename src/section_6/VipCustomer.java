package section_6;

public class VipCustomer {

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    private String name;
    private String creditLimit;
    private String email;


    //returns all received values
    public VipCustomer(String name, String creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    //3rd value is default
    public VipCustomer(String name, String creditLimit) {
        this(name, creditLimit, "default@email.com");
    }

    //empty constructor returns default values
    public VipCustomer() {
        this("defaultName","defaultCreditLimit","defaultEmail");
    }
}
