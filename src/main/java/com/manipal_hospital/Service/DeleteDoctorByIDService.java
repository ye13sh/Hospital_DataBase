package com.manipal_hospital.Service;

import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Repository.DeleteDoctorByIDRepository;

public class DeleteDoctorByIDService {
    private static DeleteDoctorByIDRepository repository;

    public DeleteDoctorByIDService() {
        repository=new DeleteDoctorByIDRepository();
    }

    public void deleteDoctor(int id)throws DB_ERROR_Exception {
        repository.deleteDoctor(id);
    }
}
