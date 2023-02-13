package entity.table_per_class;

import entity.single_table.PurchaseordersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class SuppliersEntity extends PersonEntity {
    private String suppliersEntity = "SuppliersEntity";
    @OneToMany(mappedBy = "suppliersBySupplierId")
    private Collection<PurchaseordersEntity> purchaseordersById;

    public Collection<PurchaseordersEntity> getPurchaseordersById() {
        return purchaseordersById;
    }

    public void setPurchaseordersById(Collection<PurchaseordersEntity> purchaseordersById) {
        this.purchaseordersById = purchaseordersById;
    }

    public String getSuppliersEntity() {
        return suppliersEntity;
    }

    public void setSuppliersEntity(String suppliersEntity) {
        this.suppliersEntity = suppliersEntity;
    }

    @Override
    public String toString() {
        return "SuppliersEntity{" +
                "suppliersEntity='" + suppliersEntity + '\'' +
                ", purchaseordersById=" + purchaseordersById +
                '}';
    }
}
