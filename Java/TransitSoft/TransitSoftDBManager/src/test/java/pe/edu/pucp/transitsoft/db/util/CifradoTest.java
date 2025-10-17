package pe.edu.pucp.transitsoft.db.util;

import pe.edu.pucp.transitsoft.db.util.Cifrado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author andres
 */
public class CifradoTest {
    
    public CifradoTest() {
    }

    /**
     * Test of cifrarMD5 method, of class Cifrado.
     */
    @Test
    public void testCifrarMD5() {
        System.out.println("cifrarMD5");
        String texto = "prog31inf30";        
        String resultado = Cifrado.cifrarMD5(texto);
        String resultado_esperado = "gejjr1h9xkp8z5oFshHdJA==";                                        
        assertEquals(resultado_esperado, resultado);        
    }

    /**
     * Test of descifrarMD5 method, of class Cifrado.
     */
    @Test
    public void testDescifrarMD5() {
        System.out.println("descifrarMD5");
        String textoEncriptado = "gejjr1h9xkp8z5oFshHdJA==";
        String resultado_esperado = "prog31inf30";
        String resultado = Cifrado.descifrarMD5(textoEncriptado);
        System.out.println(resultado);
        assertEquals(resultado_esperado, resultado);
    }
    
}
