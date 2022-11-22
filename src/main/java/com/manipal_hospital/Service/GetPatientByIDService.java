package com.manipal_hospital.Service;

import com.manipal_hospital.DTO.PatientDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Repository.GetPatientByIDRepository;

public class GetPatientByIDService {
    private static GetPatientByIDRepository repository;

    public GetPatientByIDService() {
        repository=new GetPatientByIDRepository();
    }
    public PatientDTO getPatientByID(int id)throws DB_ERROR_Exception {
      return   repository.getPatientByID(id);
    }
}
