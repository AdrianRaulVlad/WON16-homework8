package exerciseTwo;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PersonInfo {
    private Person person;

    public PersonInfo(Person person) {
        this.person = person;
    }

    // Method to return the full name of the person
    public String fullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    // Method to calculate and return the age of the person in years
    public int age() {
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime birthday = person.getBirthday();
        return (int) ChronoUnit.YEARS.between(birthday, currentDate);
    }

    // Getter method for the person associated with this PersonInfo object
    public Person getPerson() {
        return person;
    }

    // Setter method to update the person associated with this PersonInfo object
    public void setPerson(Person person) {
        this.person = person;
    }

    public static void main(String[] args) {
        // Create a Programmer object
        Programmer programmer;
        programmer = new Programmer("John", "Doe", LocalDateTime.of(1990, 5, 15, 0, 0
        ), "123 Street, City", LocalDateTime.of(2020, 8, 1, 0, 0
        ), "programmer", "java");

        // Accessing properties of the Programmer object
        System.out.println("Programmer Name: " + programmer.getFirstName() + " " + programmer.getLastName());
        System.out.println("Birthday: " + programmer.getBirthday());
        System.out.println("Address: " + programmer.getAddress());
        System.out.println("Date of Employment: " + programmer.getDateOfEmployment());
        System.out.println("Position: " + programmer.getPosition());
        System.out.println("Programming Language: " + programmer.getLanguage());
    }
}
