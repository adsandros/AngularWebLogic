package ve.com.farmatodo.item.to;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by atoro on 10/05/2017.
 */
public class ItemTo {
    @NotEmpty
    String ItemId;

    @NotEmpty
    String ItemDesc;

    @NotEmpty
    String Image;

    public ItemTo() {
    }

    public ItemTo(String itemId, String itemDesc, String image ){
        setItemId(itemId);
        setItemDesc(itemDesc);
        setImage(image);
    }

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    public String getItemDesc() {
        return ItemDesc;
    }

    public void setItemDesc(String itemDesc) {
        ItemDesc = itemDesc;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
