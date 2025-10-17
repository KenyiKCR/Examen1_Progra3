/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pe.edu.pucp.transitsoft.db;


import pe.edu.pucp.transitsoft.db.DBManager;
import java.sql.Connection;
import static org.junit.jupiter.api.Assertions.*;

public class DBManagerTest {
    
    @org.junit.jupiter.api.Test
    public void testGetInstance() {
        System.out.println("getInstance");                
        DBManager dBManager = DBManager.getInstance();
        assertNotNull(dBManager);
    }
    
    @org.junit.jupiter.api.Test
    public void testGetConnection() {
       System.out.println("getConnection");                
        DBManager dBManager = DBManager.getInstance();
       Connection conexion = dBManager.getConnection();
       assertNotNull(conexion);
    }
}

