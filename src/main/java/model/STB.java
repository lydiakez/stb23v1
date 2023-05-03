package model;


import java.io.Serializable;
import java.time.LocalDate;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stb")
@XmlAccessorType(XmlAccessType.FIELD)
public class STB implements Serializable {
    private static final long serialVersionUID = 1L;

    @XmlAttribute
    private Integer id;

    @XmlElement
    private String title;

    @XmlElement
    private LocalDate published;

    public STB(Integer id, String title, LocalDate published) {
        super();
        this.id = id;
        this.title = title;
        this.published = published;
    }

    public STB() {
    }

    @Override
    public String toString() {
        return "STB (" + id.toString() + ") publié le " + published.toString() + "\n" + title + "\n";
    }
}
