/**
 * Represents a patient receiving treatment in the hospital.
 * Tracks medical condition and room assignment.
 */
public class Patient extends Person {
    private String patientId;
    private String disease;
    private int roomNumber;

    /**
     * Creates a new Patient instance.
     *
     * @param patientId Unique identifier (e.g., "P201")
     * @param disease Primary diagnosis or condition
     * @param roomNumber Assigned room (must be non-negative)
     */
    public Patient(String name, int age, String gender, String patientId, String disease, int roomNumber) {
        super(name, age, gender);
        if (patientId == null || patientId.trim().isEmpty() || disease == null || disease.trim().isEmpty() || roomNumber < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.patientId = patientId;
        this.disease = disease;
        this.roomNumber = roomNumber;
    }

    // Standard setters with validation
    public void setPatientId(String patientId) {
        if (patientId == null || patientId.trim().isEmpty()) {
            throw new IllegalArgumentException("Patient ID cannot be null or empty!");
        }
        this.patientId = patientId;
    }

    public void setDisease(String disease) {
        if (disease == null || disease.trim().isEmpty()) {
            throw new IllegalArgumentException("Cannot treat without disease!");
        }
        this.disease = disease;
    }

    public void setRoomNumber(int roomNumber) {
        if (roomNumber < 0) {
            throw new IllegalArgumentException("Room number must be greater than zero!");
        }
        this.roomNumber = roomNumber;
    }

    // Standard getters
    public String getPatientId() { return patientId; }
    public String getDisease() { return disease; }
    public int getRoomNumber() { return roomNumber; }

    /**
     * Prints formatted patient information to console.
     * Includes personal details, diagnosis, and room assignment.
     */
    public void displayPatientInfo() {
        System.out.println(String.format(
                "Patient ID   : %s%n%s%nDisease      : %s%nRoom Number  : %d",
                patientId,
                super.toString(),
                disease,
                roomNumber
        ));
        System.out.println("--------------------------------");
        System.out.println();
    }

}
