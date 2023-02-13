package entity.mapped_superclass;

import entity.single_table.PurchaseordersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class PurchaseorderstatusEntity extends StatusEntity {
    private String purchaseOrderStatusEntity = "PurchaseOrderStatusEntity";
    @OneToMany(mappedBy = "ordersstatusByStatusId")
    private Collection<PurchaseordersEntity> purchaseordersById;

    public String getPurchaseOrderStatusEntity() {
        return purchaseOrderStatusEntity;
    }

    public void setPurchaseOrderStatusEntity(String purchaseOrderStatusEntity) {
        this.purchaseOrderStatusEntity = purchaseOrderStatusEntity;
    }

    public Collection<PurchaseordersEntity> getPurchaseordersById() {
        return purchaseordersById;
    }

    public void setPurchaseordersById(Collection<PurchaseordersEntity> purchaseordersById) {
        this.purchaseordersById = purchaseordersById;
    }

    @Override
    public String toString() {
        return "PurchaseorderstatusEntity{" +
                "purchaseOrderStatusEntity='" + purchaseOrderStatusEntity + '\'' +
                ", purchaseordersById=" + purchaseordersById +
                '}';
    }
}
