package entity.single_table;

import entity.concrete_class.InventorytransactionsEntity;
import entity.joined.SellorderdetailsEntity;
import entity.mapped_superclass.OrdersstatusEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

/**
 * The single table strategy maps all entities of the inheritance structure to the same database table. This approach makes polymorphic queries
 * very efficient and provides the best performance. But it also has some drawbacks. The attributes of all entities are mapped to the same
 * database table. Each record uses only a subset of the available columns and sets the rest of them to null. You can, therefore, not use
 * not null constraints on any column that isn’t mapped to all entities. That can create data integrity issues.
 * @DiscriminatorColumn & @DiscriminatorValue is used to differentiate the records.
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "OrderType")
public abstract class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private Timestamp orderDate;
    private BigDecimal shippingFee;
    private BigDecimal taxes;
    private String paymentMethod;
    private Timestamp paymentDate;
    private String notes;
    private String ordersEntity = "OrdersEntity";
    @OneToMany(mappedBy = "sellOrdersByCustomerOrderId")
    private Collection<InventorytransactionsEntity> inventorytransactionsById;
    @OneToMany(mappedBy = "sellOrdersByOrderId")
    private Collection<SellorderdetailsEntity> sellOrderdetailsById;
    @ManyToOne
    @JoinColumn(name = "statusId", referencedColumnName = "id")
    private OrdersstatusEntity ordersstatusByStatusId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(BigDecimal shippingFee) {
        this.shippingFee = shippingFee;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOrdersEntity() {
        return ordersEntity;
    }

    public void setOrdersEntity(String ordersEntity) {
        this.ordersEntity = ordersEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrdersEntity)) return false;
        OrdersEntity that = (OrdersEntity) o;
        return getId() == that.getId() && Objects.equals(getOrderDate(), that.getOrderDate()) && Objects.equals(getShippingFee(), that.getShippingFee()) && Objects.equals(getTaxes(), that.getTaxes()) && Objects.equals(getPaymentMethod(), that.getPaymentMethod()) && Objects.equals(getPaymentDate(), that.getPaymentDate()) && Objects.equals(getNotes(), that.getNotes()) && Objects.equals(getOrdersEntity(), that.getOrdersEntity()) && Objects.equals(getInventorytransactionsById(), that.getInventorytransactionsById()) && Objects.equals(getSellOrderdetailsById(), that.getSellOrderdetailsById()) && Objects.equals(getOrdersstatusByStatusId(), that.getOrdersstatusByStatusId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOrderDate(), getShippingFee(), getTaxes(), getPaymentMethod(), getPaymentDate(), getNotes(), getOrdersEntity(), getInventorytransactionsById(), getSellOrderdetailsById(), getOrdersstatusByStatusId());
    }

    public Collection<InventorytransactionsEntity> getInventorytransactionsById() {
        return inventorytransactionsById;
    }

    public void setInventorytransactionsById(Collection<InventorytransactionsEntity> inventorytransactionsById) {
        this.inventorytransactionsById = inventorytransactionsById;
    }

    public Collection<SellorderdetailsEntity> getSellOrderdetailsById() {
        return sellOrderdetailsById;
    }

    public void setSellOrderdetailsById(Collection<SellorderdetailsEntity> orderdetailsById) {
        this.sellOrderdetailsById = orderdetailsById;
    }

    public OrdersstatusEntity getOrdersstatusByStatusId() {
        return ordersstatusByStatusId;
    }

    public void setOrdersstatusByStatusId(OrdersstatusEntity ordersstatusByStatusId) {
        this.ordersstatusByStatusId = ordersstatusByStatusId;
    }

    @Override
    public String toString() {
        return "OrdersEntity{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", shippingFee=" + shippingFee +
                ", taxes=" + taxes +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentDate=" + paymentDate +
                ", notes='" + notes + '\'' +
                ", ordersEntity='" + ordersEntity + '\'' +
                ", inventorytransactionsById=" + inventorytransactionsById +
                ", sellOrderdetailsById=" + sellOrderdetailsById +
                ", ordersstatusByStatusId=" + ordersstatusByStatusId +
                '}';
    }
}
