package com.sp.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driverClass = "com.mysql.cj.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
        String dbUsername = "root";
        String dbPassword = "Rooh@#2001";
        Connection connection=null;
        Class.forName(driverClass);
        try {
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            connection.setAutoCommit(false);
            PreparedStatement pt = connection.prepareStatement("insert into account values(?,?,?,?)");
            pt.setInt(1, 454);
            pt.setString(3, "Adsdsd");
            pt.setString(2, "PASHWAN");
            pt.setInt(4, 4545);
            PreparedStatement pt2 = connection.prepareStatement("insert into account values('etetr'','KDFDF','FDF',34243)");

            int count1 = pt.executeUpdate();
            int count2 = pt2.executeUpdate();
            if (count1 > 0 && count2 > 0) {
                connection.commit();
                System.out.println("Succesfully data inserted");
            } else {
                connection.rollback();
                System.out.println("Failed data inserted");

            }
        } catch (Exception e  ) {
            if (connection != null) ;
            e.printStackTrace();

        }
}
}
