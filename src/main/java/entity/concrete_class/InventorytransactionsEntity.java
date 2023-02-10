package entity.concrete_class;

import entity.joined.PurchaseorderdetailsEntity;
import entity.single_table.OrdersEntity;
import entity.single_table.PurchaseordersEntity;
import entity.single_table.SellOrdersEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class InventorytransactionsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private Timestamp transactionCreatedDate;
    private Timestamp transactionModifiedDate;
    private int quantity;
    private String comments;
    @ManyToOne
    @JoinColumn(name = "transactionType", referencedColumnName = "id", nullable = false)
    private InventorytransactiontypesEntity inventorytransactiontypesByTransactionType;
    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id", nullable = false)
    private ProductsEntity productsByProductId;
    @ManyToOne
    @JoinColumn(name = "purchaseOrderId", referencedColumnName = "id")
    private PurchaseordersEntity purchaseordersByPurchaseOrderId;
    @ManyToOne
    @JoinColumn(name = "customerOrderId", referencedColumnName = "id")
    private SellOrdersEntity sellOrdersByCustomerOrderId;
    @OneToMany(mappedBy = "inventorytransactionsByInventoryId")
    private Collection<PurchaseorderdetailsEntity> purchaseorderdetailsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getTransactionCreatedDate() {
        return transactionCreatedDate;
    }

    public void setTransactionCreatedDate(Timestamp transactionCreatedDate) {
        this.transactionCreatedDate = transactionCreatedDate;
    }

    public Timestamp getTransactionModifiedDate() {
        return transactionModifiedDate;
    }

    public void setTransactionModifiedDate(Timestamp transactionModifiedDate) {
        this.transactionModifiedDate = transactionModifiedDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InventorytransactionsEntity)) return false;
        InventorytransactionsEntity that = (InventorytransactionsEntity) o;
        return getId() == that.getId() && getQuantity() == that.getQuantity() && Objects.equals(getTransactionCreatedDate(), that.getTransactionCreatedDate()) && Objects.equals(getTransactionModifiedDate(), that.getTransactionModifiedDate()) && Objects.equals(getComments(), that.getComments()) && Objects.equals(getInventorytransactiontypesByTransactionType(), that.getInventorytransactiontypesByTransactionType()) && Objects.equals(getProductsByProductId(), that.getProductsByProductId()) && Objects.equals(getPurchaseordersByPurchaseOrderId(), that.getPurchaseordersByPurchaseOrderId()) && Objects.equals(getSellOrdersByCustomerOrderId(), that.getSellOrdersByCustomerOrderId()) && Objects.equals(getPurchaseorderdetailsById(), that.getPurchaseorderdetailsById());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTransactionCreatedDate(), getTransactionModifiedDate(), getQuantity(), getComments(), getInventorytransactiontypesByTransactionType(), getProductsByProductId(), getPurchaseordersByPurchaseOrderId(), getSellOrdersByCustomerOrderId(), getPurchaseorderdetailsById());
    }

    public InventorytransactiontypesEntity getInventorytransactiontypesByTransactionType() {
        return inventorytransactiontypesByTransactionType;
    }

    public void setInventorytransactiontypesByTransactionType(InventorytransactiontypesEntity inventorytransactiontypesByTransactionType) {
        this.inventorytransactiontypesByTransactionType = inventorytransactiontypesByTransactionType;
    }

    public ProductsEntity getProductsByProductId() {
        return productsByProductId;
    }

    public void setProductsByProductId(ProductsEntity productsByProductId) {
        this.productsByProductId = productsByProductId;
    }

    public PurchaseordersEntity getPurchaseordersByPurchaseOrderId() {
        return purchaseordersByPurchaseOrderId;
    }

    public void setPurchaseordersByPurchaseOrderId(PurchaseordersEntity purchaseordersByPurchaseOrderId) {
        this.purchaseordersByPurchaseOrderId = purchaseordersByPurchaseOrderId;
    }

    public OrdersEntity getSellOrdersByCustomerOrderId() {
        return sellOrdersByCustomerOrderId;
    }

    public void setSellOrdersByCustomerOrderId(SellOrdersEntity sellOrdersByCustomerOrderId) {
        this.sellOrdersByCustomerOrderId = sellOrdersByCustomerOrderId;
    }

    public Collection<PurchaseorderdetailsEntity> getPurchaseorderdetailsById() {
        return purchaseorderdetailsById;
    }

    public void setPurchaseorderdetailsById(Collection<PurchaseorderdetailsEntity> purchaseorderdetailsById) {
        this.purchaseorderdetailsById = purchaseorderdetailsById;
    }

    @Override
    public String toString() {
        return "InventorytransactionsEntity{" +
                "id=" + id +
                ", transactionCreatedDate=" + transactionCreatedDate +
                ", transactionModifiedDate=" + transactionModifiedDate +
                ", quantity=" + quantity +
                ", comments='" + comments + '\'' +
                ", inventorytransactiontypesByTransactionType=" + inventorytransactiontypesByTransactionType +
                ", productsByProductId=" + productsByProductId +
                ", purchaseordersByPurchaseOrderId=" + purchaseordersByPurchaseOrderId +
                ", sellOrdersByCustomerOrderId=" + sellOrdersByCustomerOrderId +
                ", purchaseorderdetailsById=" + purchaseorderdetailsById +
                '}';
    }
}
