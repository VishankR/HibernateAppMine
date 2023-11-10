package entity.concrete_class;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class InventorytransactiontypesEntity {
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Id
    private byte id;
    private String typeName;
    @OneToMany(mappedBy = "inventorytransactiontypesByTransactionType")
    private Collection<InventorytransactionsEntity> inventorytransactionsById;
    private String DType;

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
        if (!(o instanceof InventorytransactiontypesEntity)) return false;
        InventorytransactiontypesEntity that = (InventorytransactiontypesEntity) o;
        return getId() == that.getId() && Objects.equals(getTypeName(), that.getTypeName()) && Objects.equals(getInventorytransactionsById(), that.getInventorytransactionsById());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTypeName(), getInventorytransactionsById());
    }

    public Collection<InventorytransactionsEntity> getInventorytransactionsById() {
        return inventorytransactionsById;
    }

    public void setInventorytransactionsById(Collection<InventorytransactionsEntity> inventorytransactionsById) {
        this.inventorytransactionsById = inventorytransactionsById;
    }

    @Override
    public String toString() {
        return "InventorytransactiontypesEntity{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", inventorytransactionsById=" + inventorytransactionsById +
                '}';
    }
}
