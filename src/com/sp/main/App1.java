package com.sp.springJDBC.SpringJdbcCon.main;

import java.sql.Connection;
import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sp.springJDBC.resource.JavaConfigFile;

public class App {

    public static void main(String[] args) {


//Generally we don't use this method we will provide this configure in the in the applicationContext.xml file
        DriverManagerDataSource ds = new DriverManagerDataSource();
        String driverClass = "com.mysql.cj.jdbc.Driver";
        String dbUr = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
        String dbUsername = "root";
        String dbPassword = "Rooh@#2001";

        ds.setDriverClassName(driverClass);
        ds.setUrl(dbUrl);
        ds.setUsername(dbUsername);
        ds.setPassword(dbPassword);

        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);


        Connection con = jdbcTemplate.getDataSource().getConnection();
        System.out.println("Connection successful!");
        // You can use 'con' to perform database operations
        // Remember to close the connection when done
    }
}