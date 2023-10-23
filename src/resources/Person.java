package resources;

public class Person {
    //declare instance variables
    String firstName = " ", lastName = " ";
    int age;

    public static void main(String[] args) {
        Person person = new Person(); //object of the class Person created to access instance methods
        person.setFirstName("");//call instance method to set first name empty
        person.setFirstName("");//call instance method to set last name empty
        person.setAge(10); //call instance method to set age
        //call the instance method getFullName to print  full name
        // which in turn calls getFirstName and getLastName methods
        //and returns the full name to print stmt
        System.out.println("FullName= " + person.getFullName());
        //call instance method that checks if the age entered is teen
        System.out.println(("Teen= " + person.isTeen()));
        person.setFirstName("John");
        person.setAge(18);
        //call the instance method getFullName to print  full name
        // which in turn calls getFirstName and getLastName methods
        //and returns the full name to print stmt
        System.out.println("FullName= " + person.getFullName());
        //call instance method that checks if the age entered is teen
        System.out.println(("Teen= " + person.isTeen()));
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());

    }

    //parameterised, no return type method to set first name
    public void setFirstName(String fName) {
        if (!fName.isEmpty()) {
            firstName = fName;
        }
    }

    //parameterised, no return type method to set last name
    public void setLastName(String lName) {
        if (!lName.isEmpty()) {
            lastName = lName;
        }
    }

    //parameterised, no return type method to set age
    public void setAge(int a) {
        if (a < 0 || a > 100) {
            age = 0;
        } else {
            age = a;
        }
    }

    //no parameters, return type method to return first name
    public String getFirstName() {
        return firstName;
    }
    //no parameters, return type method to return last name
    public String getLastName() {
        return lastName;
    }
    //no parameters, return type method to return age
    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    //This instance method (getFullName) calls 2 other instance methods with return value
    public String getFullName() {
        String fullName = getFirstName() + " " + getLastName();
        return fullName;
    }
}
