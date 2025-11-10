/**
 * Central management system for hospital operations.
 * Maintains collections of doctors and patients and provides
 * reporting functionality.
 *
 * Note: This is an in-memory implementation. Production systems
 * would typically use database persistence.
 */
import java.util.ArrayList;

public class HospitalManager {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void displayAllPatients() {
        System.out.println("--- All Patients Information ---");
        for (Patient patient : patients) {
            patient.displayPatientInfo();
        }
    }

    public void displayAllDoctors() {
        System.out.println("--- Doctors Information ---");
        for (Doctor doctor : doctors) {
            doctor.displayDoctorInfo();
        }
    }

    public int getTotalDoctors() {
        return doctors.size();
    }

    public int getTotalPatients() {
        return patients.size();
    }

    /**
     * Prints summary statistics for the hospital.
     * Useful for administrative reports and monitoring.
     */
    public void displaySummary() {
        System.out.println("===== Hospital Summary =====");
        System.out.println("Total Doctors : " + getTotalDoctors());
        System.out.println("Total Patients: " + getTotalPatients());
        System.out.println("============================");
    }
}