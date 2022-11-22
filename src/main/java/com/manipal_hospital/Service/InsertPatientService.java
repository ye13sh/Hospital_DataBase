package com.manipal_hospital.Service;

import com.manipal_hospital.DTO.PatientDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Repository.InsertPatientRepository;

public class InsertPatientService {
    private static InsertPatientRepository repository;

    public InsertPatientService() {
        repository=new InsertPatientRepository();
    }

    public void insertPatient(PatientDTO patientDTO)throws DB_ERROR_Exception {
        repository.insertPatient(patientDTO);
    }
}
