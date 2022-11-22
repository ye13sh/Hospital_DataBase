package com.manipal_hospital.Repository;

import com.manipal_hospital.Constants.QueryConstant;
import com.manipal_hospital.DTO.PatientDTO;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Util.ConnectionUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertPatientRepository {
    private static Connection connection;
    private static ConnectionUtil util;
    private static PreparedStatement pstmt;

    public InsertPatientRepository() {
        util=new ConnectionUtil();
    }
    //id,name,age,doctor_name,treatment,contact,address
    public void insertPatient(PatientDTO patientDTO)throws DB_ERROR_Exception {
        try {
            connection = util.getConnection();
            pstmt = connection.prepareStatement(QueryConstant.Insert_patient_query);
            pstmt.setInt(1, getLastId()+1);
            pstmt.setString(2, patientDTO.getName());
            pstmt.setInt(3, patientDTO.getAge());
            pstmt.setString(4, patientDTO.getDoctor_name());
            pstmt.setString(5, patientDTO.getTreatment());
            pstmt.setInt(6, patientDTO.getContact());
            pstmt.setString(7, patientDTO.getAddress());

            pstmt.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
            throw new DB_ERROR_Exception("Error while connecting insertPatient repository",e);
        }finally {
            try {
                connection.close();
                pstmt.close();
            }catch (Exception e){
                throw new DB_ERROR_Exception("Error while closing connection & pstmt",e);
            }
        }
    }


    private int getLastId() throws DB_ERROR_Exception{

        try {
            connection = util.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id FROM PATIENT ORDER BY id DESC LIMIT 1");
            while (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {
            System.out.println(e);
            throw  new DB_ERROR_Exception(" Exception Occurred while getting the last record primary ID",e);
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                throw new DB_ERROR_Exception("Exception Occurred while closing the Connection",e);
            }
        }
        return 0;
    }
        }