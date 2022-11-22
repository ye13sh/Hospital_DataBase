package com.manipal_hospital.Service;

import com.manipal_hospital.DTO.PatientDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Repository.UpdatePatientRepository;

public class UpdatePatientService {
    private static UpdatePatientRepository repository;

    public UpdatePatientService() {
        repository=new UpdatePatientRepository();
    }

    public void updatePatient(PatientDTO patientDTO)throws DB_ERROR_Exception {
        repository.updatePatient(patientDTO);
    }
}
