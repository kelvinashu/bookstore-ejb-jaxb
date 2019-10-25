package za.co.yanni.fofestore.jaxb;

/**
 *
 * @author fofekeney
 */
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

    private String category;
    private Integer year;
    private BigDecimal price;
    private Title title;
    private Authors authors;

    public Book() {
        super();
    }

    public Book(String category, Integer year, BigDecimal price, Title title, Authors authors) {
        super();
        this.category = category;
        this.year = year;
        this.price = price;
        this.title = title;
        this.authors = authors;
    }

    public String getCategory() {
        return category;
    }

    public Integer getYear() {
        return year;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Title getTitle() {
        return title;
    }

    public Authors getAuthors() {
        return authors;
    }

    @XmlAttribute
    public void setCategory(String category) {
        this.category = category;
    }

    @XmlElement
    public void setYear(Integer year) {
        this.year = year;
    }

    @XmlElement
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @XmlElement
    public void setTitle(Title title) {
        this.title = title;
    }

    @XmlElement
    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book [category=" + category + ", year=" + year + ", price=" + price + ", title=" + title + ", authors="
                + authors + "]";
    }

}
