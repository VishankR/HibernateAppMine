package entity.concrete_class;

import entity.ProductsEntity;
import entity.joined.PurchaseorderdetailsEntity;
import entity.single_table.OrdersEntity;
import entity.single_table.PurchaseordersEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "inventorytransactions", schema = "northwind")
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
    private OrdersEntity ordersByCustomerOrderId;
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
        if (o == null || getClass() != o.getClass()) return false;
        InventorytransactionsEntity that = (InventorytransactionsEntity) o;
        return id == that.id && quantity == that.quantity && Objects.equals(transactionCreatedDate, that.transactionCreatedDate) && Objects.equals(transactionModifiedDate, that.transactionModifiedDate) && Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transactionCreatedDate, transactionModifiedDate, quantity, comments);
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

    public OrdersEntity getOrdersByCustomerOrderId() {
        return ordersByCustomerOrderId;
    }

    public void setOrdersByCustomerOrderId(OrdersEntity ordersByCustomerOrderId) {
        this.ordersByCustomerOrderId = ordersByCustomerOrderId;
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
                ", inventorytransactiontypesByTransactionType=" + inventorytransactiontypesByTransactionType.getId() +
                ", productsByProductId=" + productsByProductId.getId() +
                ", purchaseordersByPurchaseOrderId=" + purchaseordersByPurchaseOrderId.getId() +
                ", ordersByCustomerOrderId=" + ordersByCustomerOrderId.getId() +
                ", purchaseorderdetailsById=" + purchaseorderdetailsById +
                '}';
    }
}
