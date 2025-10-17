package pe.edu.pucp.transitsoft.vigilanciavial;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ResourceBundle;
import java.util.UUID;
import pe.edu.pucp.transitsoft.bo.CapturaBO;
import pe.edu.pucp.transitsoft.bo.InfraccionBO;
import pe.edu.pucp.transitsoft.bo.CapturaBOImpl;
import pe.edu.pucp.transitsoft.bo.InfraccionBOImpl;
import pe.edu.pucp.transitsoft.model.InfraccionDTO;
import pe.edu.pucp.transitsoft.model.CapturaDTO;

public class App {
    
    public static void main(String[] args) {
        CapturaBO capturaBO = new CapturaBOImpl();
        List<CapturaDTO> capturasConExceso = 
                capturaBO.obtenerCapturasConExcesoDeVelocidad();
        
        InfraccionBO infraccionBO = new InfraccionBOImpl();
        List<InfraccionDTO> infracciones = 
                infraccionBO.crearInfracciones(capturasConExceso);
        
        //TODO: Actualizar el estado de la captura a PROCESADO
         
        for (CapturaDTO capturaDTO : capturasConExceso) {
            capturaBO.actualizar(capturaDTO);
        }
        serializarInfracciones(infracciones);
    }
    
    public static void serializarInfracciones(List<InfraccionDTO> infracciones) {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("app");
            String inboxPath = bundle.getString("inbox.path");
            
            Path directory = Paths.get(inboxPath);
            Files.createDirectories(directory);

            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            for (InfraccionDTO infraccion : infracciones) {
                String nombreArchivo = "infraccion_" + UUID.randomUUID().toString() + ".json";
                File file = new File(directory.toFile(), nombreArchivo);

                mapper.writeValue(file, infraccion);
                System.out.println("Infraccion serializada en: " + file.getAbsolutePath());
            }

        } catch (IOException e) {
            System.err.println("Error al serializar las infracciones: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }
}
