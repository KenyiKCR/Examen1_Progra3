/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.vigilanciavial;

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
import transitsoft.business.CapturaBO;
import transitsoft.business.InfraccionBO;
import transitsoft.model.CapturaDTO;
import transitsoft.model.EstadoCaptura;
import transitsoft.model.InfraccionDTO;

/**
 *
 * @author USUARIO
 */
public class App {

    public static void main(String[] args) {
        CapturaBO capturaBO = new CapturaBO();
        List<CapturaDTO> capturasConExceso = capturaBO.obtenerCapturasConExcesoDeVelocidad();

        InfraccionBO infraccionBO = new InfraccionBO();
        List<InfraccionDTO> infracciones = infraccionBO.crearInfracciones(capturasConExceso);

        //TODO: Actualizar el estado de la captura a PROCESADO
        for (CapturaDTO cap : capturasConExceso) {
            cap.setEstado(EstadoCaptura.PROCESADO);
            capturaBO.actualizar(cap);
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
