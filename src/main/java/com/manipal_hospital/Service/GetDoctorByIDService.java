package com.manipal_hospital.Service;

import com.manipal_hospital.DTO.DoctorDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Repository.GetDoctorByIDRepository;

public class GetDoctorByIDService {
    private static GetDoctorByIDRepository repository;

    public GetDoctorByIDService() {
        repository=new GetDoctorByIDRepository();
    }

    public DoctorDTO getDoctorByID(int id)throws DB_ERROR_Exception {
        return repository.getDoctorBtID(id);
    }
}
