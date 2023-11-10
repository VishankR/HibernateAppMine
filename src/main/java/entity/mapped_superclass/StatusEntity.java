package entity.mapped_superclass;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

/**
 * MappedSuperclass allows you to share the attribute definition between multiple entities. It maps each concrete class to its own table.
 * But it also has a huge drawback. A mapped superclass is not an entity(For e.g. Here StatusEntity class), and there is no table for it.
 * It means that you can’t use polymorphic queries and you also can’t define a relationship directly on
 * Mapped Superclass(For e.g. Here StatusEntity class {But if we used TABLE_PER_CLASS then we could have used polymorphic queries and
 * relationship as well for eg we could get all type of status from all class implementing StatusEntity class just by writting select * from StatusEntity;}).
 */

@MappedSuperclass
public abstract class StatusEntity {

    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private int id;

    private String status;

    private String DType;

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

    public String getDType() {
        return DType;
    }

    public void setDType() {
        this.DType = this.getClass().getName();
    }

    public void setDType(String DType) {
        this.DType = DType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StatusEntity)) return false;
        StatusEntity statusEntity1 = (StatusEntity) o;
        return getId() == statusEntity1.getId() && Objects.equals(getStatus(), statusEntity1.getStatus()) && Objects.equals(getDType(), statusEntity1.getDType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStatus(), getDType());
    }

    @Override
    public String toString() {
        return "StatusEntity{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", DType='" + DType + '\'' +
                '}';
    }
}
