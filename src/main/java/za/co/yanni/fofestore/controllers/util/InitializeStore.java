package za.co.yanni.fofestore.controllers.util;

/**
 *
 * @author fofekeney
 */
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import za.co.yanni.fofestore.jaxb.Bookstore;

public final class InitializeStore {

    private static final Logger LOGGER = Logger.getLogger(InitializeStore.class.getName());

    public static Bookstore bookstore() {
        try {

            File file = new File(InitializeStore.class.getClassLoader().getResource("bookstore.xml").getFile());

            JAXBContext jaxbContext = JAXBContext.newInstance(Bookstore.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Bookstore bookstore = (Bookstore) jaxbUnmarshaller.unmarshal(file);
            return bookstore;

        } catch (JAXBException e) {
            LOGGER.log(Level.SEVERE, "Exception occur", e);
        }
        return null;

    }
}
