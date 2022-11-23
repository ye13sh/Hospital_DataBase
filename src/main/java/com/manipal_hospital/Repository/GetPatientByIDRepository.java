package com.manipal_hospital.Repository;

import com.manipal_hospital.Constants.QueryConstant;
import com.manipal_hospital.DTO.PatientDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetPatientByIDRepository {
    private static Connection connection;
    private static ConnectionUtil util;
    private static PreparedStatement pstmt;

    public GetPatientByIDRepository() {
        util=new ConnectionUtil();
    }
    //id,name,age,doctor_name,treatment,contact,address
    public PatientDTO getPatientByID(int id)throws DB_ERROR_Exception {
        try {
            System.out.println("request repo");
            connection=util.getConnection();
            pstmt=connection.prepareStatement(QueryConstant.Get_Patient_By_ID_query);
            pstmt.setInt(1,id);

            ResultSet rs=pstmt.executeQuery();

            while (rs.next()){
                PatientDTO patientDTO=new PatientDTO();
                patientDTO.setId(rs.getInt("id"));
                patientDTO.setName(rs.getString("name"));
                patientDTO.setAge(rs.getInt("age"));
                patientDTO.setDoctor_name(rs.getString("doctor_name"));
                patientDTO.setTreatment(rs.getString("treatment"));
                patientDTO.setContact(rs.getInt("contact"));
                patientDTO.setAddress(rs.getString("address"));
                return patientDTO;

            }

        }catch (Exception e){
            System.out.println(e);
            throw new DB_ERROR_Exception("Error while connecting getPatient repository",e);

        }finally {
            try {
                connection.close();
                pstmt.close();
            }catch (Exception e){
                throw new DB_ERROR_Exception("Error while closing connection & pstmt",e);
            }

        }
        return null;
    }
}
