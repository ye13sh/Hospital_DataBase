package com.manipal_hospital.Constants;

public class QueryConstant {
    public static final String Insert_Doctor_query="insert into DOCTOR(id,name,age,contact,mail,qualification,specialization,address) VALUE(?,?,?,?,?,?,?,?)";
    public static final String Insert_patient_query="insert into PATIENT(id,name,age,doctor_name,treatment,contact,address) VALUE(?,?,?,?,?,?,?)";
    public static final String Delete_Doctor_query="delete from DOCTOR where id=?";
    public static final String Delete_Patient_query="delete from PATIENT where id=?";
    public static final String Get_Doctor_By_ID_query="select name,age,contact,mail,qualification,specialization,address from DOCTOR where id=?";
    public static final String Get_Patient_By_ID_query="select id,name,age,doctor_name,treatment,contact,address from PATIENT where id=?";
    public static final String Update_Doctor_query="update DOCTOR set name=?,age=?,contact=?,mail=?,qualification=?,specialization=?,address=? where id=?";
    public static final String Update_Patient_query="update PATIENT set name=?,age=?,doctor_name=?,treatment=?,contact=?,address=? where id=?";
}
