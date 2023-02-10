package entity.table_per_class;

import entity.single_table.PurchaseordersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "suppliers", schema = "northwind")
public class SuppliersEntity extends Person {
    @OneToMany(mappedBy = "suppliersBySupplierId")
    private Collection<PurchaseordersEntity> purchaseordersById;

    public Collection<PurchaseordersEntity> getPurchaseordersById() {
        return purchaseordersById;
    }

    public void setPurchaseordersById(Collection<PurchaseordersEntity> purchaseordersById) {
        this.purchaseordersById = purchaseordersById;
    }

    @Override
    public String toString() {
        return "SuppliersEntity{" +
                "purchaseordersById=" + purchaseordersById +
                '}';
    }
}
