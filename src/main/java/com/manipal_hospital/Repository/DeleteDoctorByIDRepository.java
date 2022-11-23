package com.manipal_hospital.Repository;

import com.manipal_hospital.Constants.QueryConstant;
import com.manipal_hospital.Exception.DB_ERROR_Exception;
import com.manipal_hospital.Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDoctorByIDRepository {
    private static Connection connection;
    private static ConnectionUtil util;
    private static PreparedStatement pstmt;

    public DeleteDoctorByIDRepository() {
        util=new ConnectionUtil();
    }
    public void deleteDoctor(int id)throws DB_ERROR_Exception {
        try {
            System.out.println("request came to repository");
            connection=util.getConnection();
            pstmt=connection.prepareStatement(QueryConstant.Delete_Doctor_query);
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
            System.out.println("successfully deleted");

        }catch (Exception e){
            throw new DB_ERROR_Exception("Error while connecting deleteDoctor repository",e);
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
