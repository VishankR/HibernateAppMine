package entity.single_table;

import entity.concrete_class.InventorytransactionsEntity;
import entity.joined.OrderdetailsEntity;
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
@Table(name = "orders", schema = "northwind")
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
    @OneToMany(mappedBy = "ordersByCustomerOrderId")
    private Collection<InventorytransactionsEntity> inventorytransactionsById;
    @OneToMany(mappedBy = "ordersByOrderId")
    private Collection<OrderdetailsEntity> orderdetailsById;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return id == that.id && Objects.equals(orderDate, that.orderDate) && Objects.equals(shippingFee, that.shippingFee) && Objects.equals(taxes, that.taxes) && Objects.equals(paymentMethod, that.paymentMethod) && Objects.equals(paymentDate, that.paymentDate) && Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDate, shippingFee, taxes, paymentMethod, paymentDate, notes);
    }

    public Collection<InventorytransactionsEntity> getInventorytransactionsById() {
        return inventorytransactionsById;
    }

    public void setInventorytransactionsById(Collection<InventorytransactionsEntity> inventorytransactionsById) {
        this.inventorytransactionsById = inventorytransactionsById;
    }

    public Collection<OrderdetailsEntity> getOrderdetailsById() {
        return orderdetailsById;
    }

    public void setOrderdetailsById(Collection<OrderdetailsEntity> orderdetailsById) {
        this.orderdetailsById = orderdetailsById;
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
                ", notes='" + notes + '\'' +
                ", inventorytransactionsById=" + inventorytransactionsById +
                ", orderdetailsById=" + orderdetailsById +
                ", ordersstatusByStatusId=" + ordersstatusByStatusId.getId() +
                '}';
    }
}
