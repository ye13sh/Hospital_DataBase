package com.manipal_hospital.Repository;

import com.manipal_hospital.Constants.QueryConstant;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeletePatientByIDRepository {
    private static Connection connection;
    private static ConnectionUtil util;
    private static PreparedStatement pstmt;

    public DeletePatientByIDRepository() {
        util=new ConnectionUtil();
    }
    public void deletePatient(int id)throws DB_ERROR_Exception {
        try{
            connection= util.getConnection();
            pstmt=connection.prepareStatement(QueryConstant.Delete_Patient_query);
            pstmt.setInt(1,id);
            pstmt.executeUpdate();

        }catch (Exception e){
            throw new DB_ERROR_Exception("Error while connecting deletePatient repository",e);
        }finally {
            try {
                connection.close();
                pstmt.close();
            }catch (Exception e){
                throw new DB_ERROR_Exception("Error while closing connection & pstmt",e);
            }

        }
    }
}
