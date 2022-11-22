package com.manipal_hospital.Service;

import com.manipal_hospital.DTO.DoctorDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Repository.UpdateDoctorRepository;

public class UpdateDoctorService {
    private static UpdateDoctorRepository repository;

    public UpdateDoctorService() {
        repository=new UpdateDoctorRepository();
    }

    public void updateDoctor(DoctorDTO doctorDTO)throws DB_ERROR_Exception {
        repository.updateDoctor(doctorDTO);
    }
}
