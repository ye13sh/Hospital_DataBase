package com.manipal_hospital.Service;

import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Repository.DeletePatientByIDRepository;

public class DeletePatientByIDService {
    private static DeletePatientByIDRepository repository;

    public DeletePatientByIDService() {
        repository=new DeletePatientByIDRepository();
    }

    public void deletePatient(int id)throws DB_ERROR_Exception {
        repository.deletePatient(id);
    }
}
