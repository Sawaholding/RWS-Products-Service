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



//    name: "Sandwiches",
//            image: "https://images.unsplash.com/photo-1554433607-66b5efe9d304?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8c2FuZHdpY2h8ZW58MHx8MHx8&w=1000&q=80",
//            id: "02823898-5216-4173-98fd-1f10ad1c5928",
//            "dateTimeCreated": "2022-03-08T15:29:10.859"


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
