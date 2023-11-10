package entity.joined;

import entity.concrete_class.InventorytransactionsEntity;
import entity.concrete_class.ProductsEntity;
import entity.single_table.PurchaseordersEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class PurchaseorderdetailsEntity extends DetailEntity {
    private Timestamp dateReceived;
    private byte postedToInventory;
    @ManyToOne
    @JoinColumn(name = "purchaseOrderId", referencedColumnName = "id", nullable = false)
    private PurchaseordersEntity purchaseordersByPurchaseOrderId;
    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private ProductsEntity productsByProductId;
    @ManyToOne
    @JoinColumn(name = "inventoryId", referencedColumnName = "id")
    private InventorytransactionsEntity inventorytransactionsByInventoryId;

    public PurchaseorderdetailsEntity() {
        this.setDType(this.getClass().getName());
    }

    public Timestamp getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Timestamp dateReceived) {
        this.dateReceived = dateReceived;
    }

    public byte getPostedToInventory() {
        return postedToInventory;
    }

    public void setPostedToInventory(byte postedToInventory) {
        this.postedToInventory = postedToInventory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseorderdetailsEntity)) return false;
        if (!super.equals(o)) return false;
        PurchaseorderdetailsEntity that = (PurchaseorderdetailsEntity) o;
        return getPostedToInventory() == that.getPostedToInventory() && Objects.equals(getDType(), that.getDType()) && Objects.equals(getDateReceived(), that.getDateReceived()) && Objects.equals(getPurchaseordersByPurchaseOrderId(), that.getPurchaseordersByPurchaseOrderId()) && Objects.equals(getProductsByProductId(), that.getProductsByProductId()) && Objects.equals(getInventorytransactionsByInventoryId(), that.getInventorytransactionsByInventoryId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDType(), getDateReceived(), getPostedToInventory(), getPurchaseordersByPurchaseOrderId(), getProductsByProductId(), getInventorytransactionsByInventoryId());
    }

    public PurchaseordersEntity getPurchaseordersByPurchaseOrderId() {
        return purchaseordersByPurchaseOrderId;
    }

    public void setPurchaseordersByPurchaseOrderId(PurchaseordersEntity purchaseordersByPurchaseOrderId) {
        this.purchaseordersByPurchaseOrderId = purchaseordersByPurchaseOrderId;
    }

    public ProductsEntity getProductsByProductId() {
        return productsByProductId;
    }

    public void setProductsByProductId(ProductsEntity productsByProductId) {
        this.productsByProductId = productsByProductId;
    }

    public InventorytransactionsEntity getInventorytransactionsByInventoryId() {
        return inventorytransactionsByInventoryId;
    }

    public void setInventorytransactionsByInventoryId(InventorytransactionsEntity inventorytransactionsByInventoryId) {
        this.inventorytransactionsByInventoryId = inventorytransactionsByInventoryId;
    }

    @Override
    public String toString() {
        return "PurchaseorderdetailsEntity{" +
                ", dateReceived=" + dateReceived +
                ", postedToInventory=" + postedToInventory +
                ", purchaseordersByPurchaseOrderId=" + purchaseordersByPurchaseOrderId +
                ", productsByProductId=" + productsByProductId +
                ", inventorytransactionsByInventoryId=" + inventorytransactionsByInventoryId +
                '}';
    }
}
