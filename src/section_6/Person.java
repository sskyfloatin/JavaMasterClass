package section_6;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public void setFirstName(String name) {
        this.firstName = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if(age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }
    public boolean isTeen() {
        if(this.age <= 12 || this.age >= 20) {
            return false;
        }
        return true;
    }
    public String getFullName() {
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        }
        else if (this.firstName.isEmpty()) {
            return this.lastName;
        }
        else if (this.lastName.isEmpty()) {
            return this.firstName;
        }
        return this.firstName + " " + this.lastName;
    }
}
