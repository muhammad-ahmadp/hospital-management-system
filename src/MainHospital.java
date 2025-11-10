/**
 * Entry point for the Hospital Management System.
 * Demonstrates basic CRUD operations with sample data.
 */
public class MainHospital {
    public static void main(String[] args) {
        HospitalManager hospitalManager = new HospitalManager();

        // Sample doctors
        Doctor d1 = new Doctor("Dr. Ali", 40, "Male", "D101", "Cardiology", 150000.0);
        Doctor d2 = new Doctor("Dr. Sara Khan", 24, "Female", "D102", "Neurology", 140000.0);

        // Sample patients
        Patient p1 = new Patient("Ahmad Khan", 40, "Male", "P201", "Heart Attack", 10);
        Patient p2 = new Patient("Sara Ali", 20, "Female", "P202", "Migraine", 14);
        Patient p3 = new Patient("Bilal Shah", 50, "Male", "P203", "Diabetes", 16);

        // Add to system
        hospitalManager.addDoctor(d1);
        hospitalManager.addDoctor(d2);
        hospitalManager.addPatient(p1);
        hospitalManager.addPatient(p2);
        hospitalManager.addPatient(p3);

        // Display information
        hospitalManager.displayAllDoctors();
        hospitalManager.displayAllPatients();
        hospitalManager.displaySummary();
    }
}