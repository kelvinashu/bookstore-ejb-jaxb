package za.co.yanni.fofestore.jaxb;

/**
 *
 * @author fofekeney
 */
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Authors {

    private List<String> authors;

    public Authors() {
        super();
    }

    public Authors(List<String> author) {
        super();
        this.authors = author;
    }

    public List<String> getAuthor() {
        return authors;
    }

    @XmlElement
    public void setAuthor(List<String> author) {
        this.authors = author;
    }

    @Override
    public String toString() {
        return "Authors [author=" + authors + "]";
    }

}
