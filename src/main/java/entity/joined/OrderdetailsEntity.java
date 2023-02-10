package entity.joined;

import entity.mapped_superclass.OrderdetailsstatusEntity;
import entity.ProductsEntity;
import entity.single_table.OrdersEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "orderdetails", schema = "northwind")
public class OrderdetailsEntity extends Detail{
    private double discount;
    private Timestamp dateAllocated;
    private Integer purchaseOrderId;
    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "id", nullable = false)
    private OrdersEntity ordersByOrderId;
    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private ProductsEntity productsByProductId;
    @ManyToOne
    @JoinColumn(name = "statusId", referencedColumnName = "id")
    private OrderdetailsstatusEntity orderdetailsstatusByStatusId;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Timestamp getDateAllocated() {
        return dateAllocated;
    }

    public void setDateAllocated(Timestamp dateAllocated) {
        this.dateAllocated = dateAllocated;
    }

    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderdetailsEntity that = (OrderdetailsEntity) o;
        return Double.compare(that.discount, discount) == 0 && Objects.equals(dateAllocated, that.dateAllocated) && Objects.equals(purchaseOrderId, that.purchaseOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discount, dateAllocated, purchaseOrderId);
    }

    public OrdersEntity getOrdersByOrderId() {
        return ordersByOrderId;
    }

    public void setOrdersByOrderId(OrdersEntity ordersByOrderId) {
        this.ordersByOrderId = ordersByOrderId;
    }

    public ProductsEntity getProductsByProductId() {
        return productsByProductId;
    }

    public void setProductsByProductId(ProductsEntity productsByProductId) {
        this.productsByProductId = productsByProductId;
    }

    public OrderdetailsstatusEntity getOrderdetailsstatusByStatusId() {
        return orderdetailsstatusByStatusId;
    }

    public void setOrderdetailsstatusByStatusId(OrderdetailsstatusEntity orderdetailsstatusByStatusId) {
        this.orderdetailsstatusByStatusId = orderdetailsstatusByStatusId;
    }

    @Override
    public String toString() {
        return "OrderdetailsEntity{" +
                ", discount=" + discount +
                ", dateAllocated=" + dateAllocated +
                ", purchaseOrderId=" + purchaseOrderId +
                ", ordersByOrderId=" + ordersByOrderId.getId() +
                ", productsByProductId=" + productsByProductId.getId() +
                ", orderdetailsstatusByStatusId=" + orderdetailsstatusByStatusId.getId() +
                '}';
    }
}
