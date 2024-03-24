package models;

import java.util.List;

public class Hospital {
    int id;
    String address;
    String emailId;
    int capacity;
    List<Patient> patients;
    List<Doctor> doctors;
}
