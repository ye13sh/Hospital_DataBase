package com.manipal_hospital.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import static com.manipal_hospital.Constants.DBConstant.*;

public class ConnectionUtil {
    private static Connection connection;

    public Connection getConnection()throws Exception {
        Class.forName(Driver_Name);
        connection= DriverManager.getConnection(URL,user_name,password);
        return connection;
    }
}
