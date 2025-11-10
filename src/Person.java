/**
 * Represents a person in the hospital system.
 * Base class for both Doctor and Patient entities.
 *
 * @author [Muhammad Ahmad]
 * @version 1.0
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    /**
     * Creates a new Person with validation.
     *
     * @param name The person's full name (cannot be empty)
     * @param age The person's age (must be non-negative)
     * @param gender The person's gender (cannot be empty)
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Person(String name, int age, String gender) {
        if (name == null || name.trim().isEmpty() || age < 0 || gender == null || gender.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ Invalid input!");
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Standard setters with validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ Name cannot be null or empty!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("❌ Age must be greater than zero!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if (gender == null || gender.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ Gender cannot be null or empty!");
        }
        this.gender = gender;
    }

    // Standard getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }

    @Override
    public String toString() {
        return String.format(
                "Name        : %s%n" +
                        "Age         : %d%n" +
                        "Gender      : %s",
                name, age, gender
        );
    }
}