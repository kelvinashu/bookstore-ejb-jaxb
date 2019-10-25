package za.co.yanni.fofestore.jaxb;

/**
 *
 * @author fofekeney
 */
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
public class Title {
	private String value;
	private String lang;

	public Title() {
		super();
	}

	public Title(String value, String lang) {
		super();
		this.value = value;
		this.lang = lang;
	}

	public String getValue() {
		return value;
	}

	public String getLang() {
		return lang;
	}

	@XmlValue
	public void setValue(String value) {
		this.value = value;
	}

	@XmlAttribute
	public void setLang(String lang) {
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "Title [value=" + value + ", lang=" + lang + "]";
	}

}
