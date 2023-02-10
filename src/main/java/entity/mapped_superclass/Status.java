package entity.mapped_superclass;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * MappedSuperclass allows you to share the attribute definition between multiple entities. It maps each concrete class to its own table.
 * But it also has a huge drawback. A mapped superclass is not an entity(For e.g. Here Status class), and there is no table for it.
 * It means that you can’t use polymorphic queries and you also can’t define a relationship directly on
 * Mapped Superclass(For e.g. Here Status class {But if we used TABLE_PER_CLASS then we could have used polymorphic queries and
 * relationship as well for eg we could get all type of status from all class implementing Status class just by writting select * from Status;}).
 */

@MappedSuperclass
public abstract class Status {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
