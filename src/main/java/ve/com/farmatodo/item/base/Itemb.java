package ve.com.farmatodo.item.base;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ve.com.farmatodo.item.to.ItemTo;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by atoro on 10/05/2017.
 */

@RestController
@RequestMapping(value = "/items")
public class Itemb {

    private static final List<ItemTo> DUMMY_ITEMS = new ArrayList<ItemTo>();
    private ItemTo itemTo;

    static {
        DUMMY_ITEMS.add(new ItemTo("111554448", "Harina Pan", "No Tiene"));
        DUMMY_ITEMS.add(new ItemTo("111852987", "Leche en Polvo la Campiña", "No Tiene"));
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<ItemTo> getItems() {
        return DUMMY_ITEMS;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addItem(@RequestBody @Valid ItemTo itemTo) {
        DUMMY_ITEMS.add(itemTo);
    }

    public static List<ItemTo> getDummyItems() {
        return DUMMY_ITEMS;
    }

    public ItemTo getItemTo() {
        return itemTo;
    }

    public void setItemTo(ItemTo itemTo) {
        this.itemTo = itemTo;
    }
}