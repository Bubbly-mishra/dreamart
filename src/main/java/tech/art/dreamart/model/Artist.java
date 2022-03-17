package tech.art.dreamart.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Artist implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    private String name;
    private String talent;
    private String title;
    private String phone;
    private String bestPainting;
    @Column(nullable = false, updatable = false)
    private String artistCode;

    public Artist(long id, String name, String talent, String title, String phone, String bestPainting, String artistCode) {
        this.id = id;
        this.name = name;
        this.talent = talent;
        this.title = title;
        this.phone = phone;
        this.bestPainting = bestPainting;
        this.artistCode = artistCode;
    }

    public Artist() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBestPainting() {
        return bestPainting;
    }

    public void setBestPainting(String bestPainting) {
        this.bestPainting = bestPainting;
    }

    public String getArtistCode() {
        return artistCode;
    }

    public void setArtistCode(String artistCode) {
        this.artistCode = artistCode;
    }
}
