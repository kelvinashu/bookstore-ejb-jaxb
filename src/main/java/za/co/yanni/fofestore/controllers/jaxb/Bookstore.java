package za.co.yanni.fofestore.jaxb;

/**
 *
 * @author fofekeney
 */
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bookstore {
	private List<Book> book;

	public Bookstore() {
		super();
	}

	public Bookstore(List<Book> book) {
		super();
		this.book = book;
	}

	public List<Book> getBook() {
		return book;
	}

	@XmlElement
	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Bookstore [book=" + book + "]";
	}

}

