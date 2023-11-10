package entity.joined;

import entity.concrete_class.ProductsEntity;
import entity.mapped_superclass.OrderdetailsstatusEntity;
import entity.single_table.OrdersEntity;
import entity.single_table.SellOrdersEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class SellorderdetailsEntity extends DetailEntity {
    private double discount;
    private Timestamp dateAllocated;
    private Integer purchaseOrderId;
    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "id", nullable = false)
    private SellOrdersEntity sellOrdersByOrderId;
    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private ProductsEntity productsByProductId;
    @ManyToOne
    @JoinColumn(name = "statusId", referencedColumnName = "id")
    private OrderdetailsstatusEntity orderdetailsstatusByStatusId;

    public SellorderdetailsEntity() {
        this.setDType(this.getClass().getName());
    }

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
        if (!(o instanceof SellorderdetailsEntity)) return false;
        if (!super.equals(o)) return false;
        SellorderdetailsEntity that = (SellorderdetailsEntity) o;
        return Double.compare(that.getDiscount(), getDiscount()) == 0 && Objects.equals(getDType(), that.getDType()) && Objects.equals(getDateAllocated(), that.getDateAllocated()) && Objects.equals(getPurchaseOrderId(), that.getPurchaseOrderId()) && Objects.equals(getSellOrdersByOrderId(), that.getSellOrdersByOrderId()) && Objects.equals(getProductsByProductId(), that.getProductsByProductId()) && Objects.equals(getOrderdetailsstatusByStatusId(), that.getOrderdetailsstatusByStatusId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDType(), getDiscount(), getDateAllocated(), getPurchaseOrderId(), getSellOrdersByOrderId(), getProductsByProductId(), getOrderdetailsstatusByStatusId());
    }

    public OrdersEntity getSellOrdersByOrderId() {
        return sellOrdersByOrderId;
    }

    public void setSellOrdersByOrderId(OrdersEntity ordersByOrderId) {
        this.sellOrdersByOrderId = sellOrdersByOrderId;
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
        return "SellorderdetailsEntity{" +
                ", discount=" + discount +
                ", dateAllocated=" + dateAllocated +
                ", purchaseOrderId=" + purchaseOrderId +
                ", sellOrdersByOrderId=" + sellOrdersByOrderId +
                ", productsByProductId=" + productsByProductId +
                ", orderdetailsstatusByStatusId=" + orderdetailsstatusByStatusId +
                '}';
    }
}
