package ve.com.farmatodo.item.to;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by atoro on 31/05/2017.
 */
public class ImageTo {

    @NotEmpty
    private int Id;

    @NotEmpty
    private String Name;

    public ImageTo(){}

    public ImageTo(int id, String name){
       setId(id);
       setName(name);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
