# 🏥 Hospital Management System

A simple console-based Hospital Management System built with Java, demonstrating core OOP principles including inheritance, encapsulation, and polymorphism.

## 📋 Features

- ✅ Add and manage doctors with specializations
- ✅ Add and manage patients with medical conditions
- ✅ Display comprehensive doctor and patient information
- ✅ Generate hospital summary reports
- ✅ Input validation for all data fields
- ✅ Clean object-oriented design

## 🛠️ Technologies Used

- **Language:** Java
- **Concepts:** OOP, Inheritance, Encapsulation
- **Design Pattern:** Object-Oriented Programming

## 📁 Project Structure

```
hospital-management-system/
│
├── Person.java          # Base class for common attributes
├── Doctor.java          # Doctor entity with specialization
├── Patient.java         # Patient entity with medical details
├── HospitalManager.java # Core management system
└── MainHospital.java    # Entry point with sample data
```

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or terminal

### Steps

1. **Clone the repository**
```bash
git clone https://github.com/muhammad-ahmadp/hospital-management-system.git
cd hospital-management-system
```

2. **Compile the Java files**
```bash
javac *.java
```

3. **Run the application**
```bash
java MainHospital
```

## 📊 Sample Output

```
--- Doctors Information ---
Doctor ID    : D101
Name         : Dr. Ali
Age          : 40
Gender       : Male
Specialization: Cardiology
Salary       : 150000.00
--------------------------------

Doctor ID    : D102
Name         : Dr. Sara Khan
Age          : 24
Gender       : Female
Specialization: Neurology
Salary       : 140000.00
--------------------------------

--- All Patients Information ---
Patient ID   : P201
Name         : Ahmad Khan
Age          : 40
Gender       : Male
Disease      : Heart Attack
Room Number  : 10
--------------------------------

Patient ID   : P202
Name         : Sara Ali
Age          : 20
Gender       : Female
Disease      : Migraine
Room Number  : 14
--------------------------------

Patient ID   : P203
Name         : Bilal Shah
Age          : 50
Gender       : Male
Disease      : Diabetes
Room Number  : 16
--------------------------------

===== Hospital Summary =====
Total Doctors : 2
Total Patients: 3
============================

```

## 🎯 Key Concepts Demonstrated

- **Inheritance:** Doctor and Patient classes extend Person
- **Encapsulation:** Private fields with public getters/setters
- **Validation:** Comprehensive input validation in constructors
- **Polymorphism:** Overriding toString() method
- **Collections:** ArrayList for managing multiple entities

## 🔮 Future Enhancements

- [ ] Add search functionality (by ID, name, specialization)
- [ ] Implement update and delete operations
- [ ] Add database integration (MySQL/PostgreSQL)
- [ ] Create a GUI using JavaFX or Swing
- [ ] Add appointment scheduling system
- [ ] Implement billing and payment tracking
- [ ] Add unit tests with JUnit

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Your Name**
- GitHub: [@yourusername](https://github.com/muhammad-ahmadp)
- LinkedIn: [Your Profile](https://linkedin.com/in/muhammad-ahmadcs)

## ⭐ Show your support

Give a ⭐️ if this project helped you learn!

---

**Note:** This is a learning project demonstrating OOP concepts in Java. For production use, consider adding database integration, security features, and comprehensive error handling.
