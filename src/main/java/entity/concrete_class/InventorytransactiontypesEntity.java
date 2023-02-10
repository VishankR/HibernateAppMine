package entity.concrete_class;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "inventorytransactiontypes", schema = "northwind")
public class InventorytransactiontypesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private byte id;
    private String typeName;
    @OneToMany(mappedBy = "inventorytransactiontypesByTransactionType")
    private Collection<InventorytransactionsEntity> inventorytransactionsById;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InventorytransactiontypesEntity that = (InventorytransactiontypesEntity) o;
        return id == that.id && Objects.equals(typeName, that.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeName);
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
