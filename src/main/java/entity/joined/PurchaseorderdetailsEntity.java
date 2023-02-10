package entity.joined;

import entity.ProductsEntity;
import entity.concrete_class.InventorytransactionsEntity;
import entity.single_table.PurchaseordersEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "purchaseorderdetails", schema = "northwind")
public class PurchaseorderdetailsEntity extends Detail{
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
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseorderdetailsEntity that = (PurchaseorderdetailsEntity) o;
        return postedToInventory == that.postedToInventory && Objects.equals(dateReceived, that.dateReceived);
    }

    @Override
    public int hashCode() {
        return Objects.hash( dateReceived, postedToInventory);
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
                ", purchaseordersByPurchaseOrderId=" + purchaseordersByPurchaseOrderId.getId() +
                ", productsByProductId=" + productsByProductId.getId() +
                ", inventorytransactionsByInventoryId=" + inventorytransactionsByInventoryId.getId() +
                '}';
    }
}
