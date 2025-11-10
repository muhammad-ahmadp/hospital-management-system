/**
 * Represents a medical doctor in the hospital system.
 * Extends Person with medical professional-specific attributes.
 */
public class Doctor extends Person {
    private String doctorID;
    private String specialization;
    private double salary;

    /**
     * Creates a new Doctor instance.
     *
     * @param doctorID Unique identifier (e.g., "D101")
     * @param specialization Medical field (e.g., "Cardiology")
     * @param salary Annual salary (must be non-negative)
     */
    public Doctor(String name, int age, String gender, String doctorID, String specialization, double salary) {
        super(name, age, gender);
        if (doctorID == null || doctorID.trim().isEmpty() || specialization == null || specialization.trim().isEmpty() || salary < 0) {
            throw new IllegalArgumentException("❌ Invalid input!");
        }
        this.doctorID = doctorID;
        this.specialization = specialization;
        this.salary = salary;
    }

    // Standard setters with validation
    public void setDoctorID(String doctorID) {
        if (doctorID == null || doctorID.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ ID cannot be null or empty!");
        }
        this.doctorID = doctorID;
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("❌ Specialization cannot be null or empty!");
        }
        this.specialization = specialization;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("❌ Salary must be greater than zero!");
        }
        this.salary = salary;
    }

    // Standard getters
    public String getDoctorID() { return doctorID; }
    public String getSpecialization() { return specialization; }
    public double getSalary() { return salary; }

    /**
     * Prints formatted doctor information to console.
     * Includes both personal and professional details.
     */
    public void displayDoctorInfo() {
        System.out.println(String.format(
                "Doctor ID    : %s%n%s%nSpecialization: %s%nSalary       : %.2f",
                doctorID,
                super.toString(),
                specialization,
                salary
        ));
        System.out.println("--------------------------------");
        System.out.println();
    }
}