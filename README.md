# Hospital Management System

A console-based application developed in Java to simulate and manage core operations of a hospital, including doctor and patient records. This project serves as a strong demonstration of fundamental Object-Oriented Programming (OOP) principles, particularly **Inheritance**, **Encapsulation**, and **Polymorphism**.

[![Java](https://img.shields.io/badge/Java-11+-orange.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

---

## 1. Overview

The Hospital Management System is designed to model the relationships between different entities within a healthcare environment. It allows for the structured management of medical personnel and patients, providing a clear and organized way to view and summarize hospital data.

### Core Features

*   **Entity Management:** Structured addition and management of Doctor and Patient records.
*   **OOP Demonstration:** Clear implementation of Inheritance (`Doctor` and `Patient` extending `Person`), Encapsulation, and Polymorphism.
*   **Data Validation:** Input validation is enforced within the constructors to ensure data integrity upon object creation.
*   **Reporting:** Ability to generate a summary report, including the total count of doctors and patients.
*   **User Interface:** A simple, clean Command Line Interface (CLI) for interactive use.

---

## 2. Technical Architecture

The system is architected around a base class and specialized subclasses, showcasing a hierarchical data model suitable for complex real-world systems.

### Project Structure

```
hospital-management-system/
│
├── Person.java          # Base class for common attributes (name, age, gender)
├── Doctor.java          # Subclass for doctor-specific attributes (specialization)
├── Patient.java         # Subclass for patient-specific attributes (disease, room number)
├── HospitalManager.java # Core management and collection logic
└── MainHospital.java    # Application entry point
```

### Key Classes and OOP Concepts

| Class | Primary Role | OOP Concept Demonstrated |
| :--- | :--- | :--- |
| `Person.java` | Abstract base class for all human entities. | **Inheritance** (Base Class), Encapsulation. |
| `Doctor.java` | Extends `Person`, adds medical specialization. | **Inheritance** (Subclass), Constructor Chaining. |
| `Patient.java` | Extends `Person`, adds medical condition and room details. | **Inheritance** (Subclass), Data Validation. |
| `HospitalManager.java` | Manages collections of `Doctor` and `Patient` objects. | Collection Management (`ArrayList`), Reporting Logic. |

---

## 3. Design Decisions

The primary design goal was to create a robust and scalable model for the hospital's entities, focusing on core OOP principles.

*   **Inheritance for Reusability:** By using a `Person` base class, common attributes like name, age, and gender are defined once, reducing code duplication in the `Doctor` and `Patient` subclasses.
*   **Encapsulation for Data Integrity:** Private fields with controlled access via public getters and setters ensure that data modification is managed and validated.
*   **Polymorphism in Display:** The use of the `toString()` method, which is overridden in subclasses, allows for polymorphic display of different entity types through a unified interface.
*   **Centralized Management:** The `HospitalManager` class centralizes all collection and reporting logic, separating it from the entity definitions and the main application loop.

### Code Example: Inheritance Structure

The `Doctor` and `Patient` classes inherit from `Person`, demonstrating a clear `is-a` relationship:

```java
// Example of Doctor class extending Person
public class Doctor extends Person {
    private String specialization;
    // ... constructor and methods
}

// Example of Patient class extending Person
public class Patient extends Person {
    private String disease;
    // ... constructor and methods
}
```

---

## 4. How to Run

### Prerequisites
*   Java Development Kit (JDK) 8 or higher

### Installation and Execution

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/muhammad-ahmadp/hospital-management-system.git
    cd hospital-management-system
    ```

2.  **Compile the Java files:**
    ```bash
    javac *.java
    ```

3.  **Run the application:**
    ```bash
    java MainHospital
    ```

### Sample Output

```
--- Doctors Information ---
Doctor ID    : D101
Name         : Dr. Ali
Specialization: Cardiology
...
--- All Patients Information ---
Patient ID   : P201
Name         : Ahmad Khan
Disease      : Heart Attack
...
===== Hospital Summary =====
Total Doctors : 2
Total Patients: 3
============================
```

---

## 5. Limitations and Future Enhancements

### Known Limitations

*   **Scope:** This is a conceptual model focused on OOP; it lacks complex features like appointment scheduling or billing.
*   **Persistence:** Data is stored in memory only and is lost upon application exit.
*   **Interface:** Limited to a console-only interface.

### What I'd Do Next

*   Implement **database integration** (e.g., using JDBC) for persistent data storage.
*   Add **search, update, and delete** functionality for all entities.
*   Develop a **Graphical User Interface (GUI)** using JavaFX or Swing.
*   Introduce **Unit Tests** using JUnit to ensure the integrity of the core entity and management logic.
*   Implement an **Appointment Scheduling System** to manage doctor and patient availability.

---

## 6. Contact and License

### Author

**Muhammad Ahmad**

*   GitHub: [@muhammad-ahmadp](https://github.com/muhammad-ahmadp)
*   LinkedIn: [muhammad-ahmadcs](https://linkedin.com/in/muhammad-ahmadcs)

### License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

### Acknowledgments

This project was built to solidify understanding of Object-Oriented Programming fundamentals in Java.
