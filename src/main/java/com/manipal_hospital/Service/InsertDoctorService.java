package com.manipal_hospital.Service;

import com.manipal_hospital.DTO.DoctorDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Repository.InsertDoctorRepository;

public class InsertDoctorService {
    private static InsertDoctorRepository repository;

    public InsertDoctorService() {
        repository=new InsertDoctorRepository();
    }

    public void insertDoctor(DoctorDTO doctorDTO)throws DB_ERROR_Exception {
        System.out.println("req service");
        repository.insertDoctor(doctorDTO);
    }
}
