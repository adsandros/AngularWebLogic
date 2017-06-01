package ve.com.farmatodo.item.base;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ve.com.farmatodo.item.to.ImageTo;
import ve.com.farmatodo.item.to.ItemTo;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by atoro on 10/05/2017.
 */

@RestController
@RequestMapping(value = "/images")
public class Imageb {

    private static final List<ImageTo> DUMMY_IMAGE = new ArrayList<ImageTo>();
    private ImageTo imageTo;

    static {
        DUMMY_IMAGE.add(new ImageTo(1, "Imagen 1"));
        DUMMY_IMAGE.add(new ImageTo(2, "Imagen 2"));
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<ImageTo> getImage() {
        return DUMMY_IMAGE;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addImage(@RequestBody @Valid ImageTo imageTo) {
        DUMMY_IMAGE.add(imageTo);
    }

    public ImageTo getImageTo() {
        return imageTo;
    }

    public void setImageTo(ImageTo imageTo) {
        this.imageTo = imageTo;
    }
}