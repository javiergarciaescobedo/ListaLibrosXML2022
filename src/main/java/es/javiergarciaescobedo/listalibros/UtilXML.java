package es.javiergarciaescobedo.listalibros;

import java.io.File;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class UtilXML {
    
    public static void guardarDatosXML(Stage stage, ListaLibros listaLibros) {
        JAXBContext contexto;
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Guardar XML en");
            File fileListaLibros = fileChooser.showSaveDialog(stage);

            //File fileListaLibros = new File("ListaLibros.xml");
            contexto = JAXBContext.newInstance(ListaLibros.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(listaLibros, System.out);
            marshaller.marshal(listaLibros, fileListaLibros);
        } catch (JAXBException ex) {
            System.out.println("Se ha producido un error");
            ex.printStackTrace();
        }            
    }
    
}
