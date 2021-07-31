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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (0 <= age && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (12 < this.age && this.age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else if (this.lastName.isEmpty()) {
            return this.firstName;
        } else if (this.firstName.isEmpty()) {
            return this.lastName;
        } else {
            return this.firstName + " " + this.lastName;
        }
    }
}
