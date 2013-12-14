/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frre.labii.conexion;

//STEP 1. Import required packages
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {
    // JDBC driver name and database URL

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    
    static final String DB_URL = "jdbc:mysql://localhost/db_projectgym";
    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";
    
    private static ConexionBD _instance;

    private ConexionBD() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    public static ConexionBD getInstance() {
        if (_instance == null) {
            try {
                _instance = new ConexionBD();
            } catch (ClassNotFoundException ex) {
                System.out.println("Driver not present on System...");
            }
        }
        return _instance;
    }

   public void deleteRecordFromTable(String deleteSQL) throws SQLException {

        Connection dbConnection = null;
        Statement stmt = null;

        try {
            dbConnection = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = dbConnection.createStatement();
            // execute delete SQL stetement
            stmt.executeUpdate(deleteSQL);

        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }

        }

    }

    public boolean insertRecordToTable(String sql) throws SQLException {

        Connection conn = null;
        Statement stmt = null;

        boolean rs = false;

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement();

            rs = stmt.execute(sql);

            stmt.close();
            conn.close();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return rs;
    }//end main

    public List<HashMap<String, Object>> makeQuery(String sql) throws SQLException {

        Connection conn = null;
        Statement stmt = null;

        List results = new ArrayList();

        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Map result = new HashMap();
                ResultSetMetaData rsMetaData = rs.getMetaData();
                int numberOfColumns = rsMetaData.getColumnCount();
                // get the column names; column indexes start from 1
                for (int i = 1; i < numberOfColumns + 1; i++) {
                    String columnName = rsMetaData.getColumnName(i);
                    int type = rsMetaData.getColumnType(i);
                    result.put(columnName, rs.getObject(columnName));
                }
                results.add(result);
            }

            rs.close();
            stmt.close();
            conn.close();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return results;
    }//end main
}//end FirstExample

