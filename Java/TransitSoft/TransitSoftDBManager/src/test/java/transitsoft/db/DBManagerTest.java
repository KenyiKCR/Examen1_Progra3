/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package transitsoft.db;

import java.sql.Connection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
public class DBManagerTest {

    public DBManagerTest() {
    }

    /**
     * Test of getInstance method, of class DBManager.
     */
    @org.junit.jupiter.api.Test
    public void testGetInstance() {
        System.out.println("testGetInstance");
        DBManager result = DBManager.getInstance();
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(result);
    }

    /**
     * Test of getConnection method, of class DBManager.
     */
    @org.junit.jupiter.api.Test
    public void testGetConnection() {
        System.out.println("testGetConnection");
        DBManager dbManager = DBManager.getInstance();
        Connection result = dbManager.getConnection();
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(result);
    }

}
