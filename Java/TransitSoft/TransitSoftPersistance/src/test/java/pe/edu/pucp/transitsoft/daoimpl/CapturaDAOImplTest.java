/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pe.edu.pucp.transitsoft.daoimpl;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pe.edu.pucp.transitsoft.model.CapturaDTO;


/**
 *
 * @author esteban
 */
public class CapturaDAOImplTest {
    
    public CapturaDAOImplTest() {
    }

    /**
     * Test of configurarListaDeColumnas method, of class CapturaDAOImpl.
     */
    @Test
    public void testConfigurarListaDeColumnas() {
        System.out.println("configurarListaDeColumnas");
        CapturaDAOImpl instance = new CapturaDAOImpl();
        instance.configurarListaDeColumnas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarSQLParaListarTodos method, of class CapturaDAOImpl.
     */
    @Test
    public void testGenerarSQLParaListarTodos() {
        System.out.println("generarSQLParaListarTodos");
        CapturaDAOImpl instance = new CapturaDAOImpl();
        String expResult = "";
        String result = instance.generarSQLParaListarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarTodos method, of class CapturaDAOImpl.
     */
    @Test
    public void testListarTodos() {
        System.out.println("listarTodos");
        CapturaDAOImpl instance = new CapturaDAOImpl();
        List<CapturaDTO> expResult = null;
        List<CapturaDTO> result = instance.listarTodos();
        for (CapturaDTO capt : result) {
            System.out.println("" + capt.getId() + capt.getFechaCaptura());
        }
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of instanciarObjetoDelResultSet method, of class CapturaDAOImpl.
     */
    @Test
    public void testInstanciarObjetoDelResultSet() throws Exception {
        System.out.println("instanciarObjetoDelResultSet");
        CapturaDAOImpl instance = new CapturaDAOImpl();
        instance.instanciarObjetoDelResultSet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarObjetoALaLista method, of class CapturaDAOImpl.
     */
    @Test
    public void testAgregarObjetoALaLista() throws Exception {
        System.out.println("agregarObjetoALaLista");
        List lista = null;
        CapturaDAOImpl instance = new CapturaDAOImpl();
        instance.agregarObjetoALaLista(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiarObjetoDelResultSet method, of class CapturaDAOImpl.
     */
    @Test
    public void testLimpiarObjetoDelResultSet() {
        System.out.println("limpiarObjetoDelResultSet");
        CapturaDAOImpl instance = new CapturaDAOImpl();
        instance.limpiarObjetoDelResultSet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class CapturaDAOImpl.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        CapturaDTO captura = new CapturaDTO();
        CapturaDAOImpl instance = new CapturaDAOImpl();
        Boolean expResult = true;
        //captura.setId(2);
        Boolean result = instance.modificar(captura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
