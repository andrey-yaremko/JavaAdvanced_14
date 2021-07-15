import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

public class Cart {

    private Integer id;
    private String total;
    private String name;
    private Set<Item> items = new HashSet<>();

    public Cart(String total, String name) {
        this.total = total;
        this.name = name;
    }

    public Cart(){};

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", total='" + total + '\'' +
                ", name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
