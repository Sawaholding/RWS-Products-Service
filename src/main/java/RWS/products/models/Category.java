package RWS.products.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "rws")
public class Category {

    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String image;
    @Column
    private String dateTimeCreated;

    public Category() {

    }

    public Category(String name, String image, String id, String dateTimeCreated) {
        this.name = name;
        this.image = image;
        this.id = id;
        this.dateTimeCreated = dateTimeCreated;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(String dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }
}
