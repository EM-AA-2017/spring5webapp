package guru.springframework.spring5webapp.Domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by EM on 8/1/20.
 */
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String pubName;
    private String pubStreet;
    private String pubCity;
    private String pubState;
    private String pubZip;

    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books = new HashSet<>();

    public Publisher(){
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "Id=" + id +
                ", pubName='" + pubName + '\'' +
                ", pubStreet='" + pubStreet + '\'' +
                ", pubCity='" + pubCity + '\'' +
                ", pubState='" + pubState + '\'' +
                ", pubZip='" + pubZip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        return id != null ? id.equals(publisher.id) : publisher.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getPubStreet() {
        return pubStreet;
    }

    public void setPubStreet(String pubStreet) {
        this.pubStreet = pubStreet;
    }

    public String getPubCity() {
        return pubCity;
    }

    public void setPubCity(String pubCity) {
        this.pubCity = pubCity;
    }

    public String getPubState() {
        return pubState;
    }

    public void setPubState(String pubState) {
        this.pubState = pubState;
    }

    public String getPubZip() {
        return pubZip;
    }

    public void setPubZip(String pubZip) {
        this.pubZip = pubZip;
    }
}
