package entity.concrete_class;

import entity.single_table.OrdersEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
/*@Polymorphism(type = PolymorphismType.EXPLICIT)*/
@Table(name = "invoices", schema = "northwind")
public class InvoicesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private Timestamp invoiceDate;
    private Timestamp dueDate;
    private BigDecimal tax;
    private BigDecimal shipping;
    private BigDecimal amountDue;
    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "id")
    private OrdersEntity ordersByOrderId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Timestamp getDueDate() {
        return dueDate;
    }

    public void setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getShipping() {
        return shipping;
    }

    public void setShipping(BigDecimal shipping) {
        this.shipping = shipping;
    }

    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoicesEntity that = (InvoicesEntity) o;
        return id == that.id /*&& Objects.equals(orderId, that.orderId)*/ && Objects.equals(invoiceDate, that.invoiceDate) && Objects.equals(dueDate, that.dueDate) && Objects.equals(tax, that.tax) && Objects.equals(shipping, that.shipping) && Objects.equals(amountDue, that.amountDue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id/*, orderId*/, invoiceDate, dueDate, tax, shipping, amountDue);
    }

    public OrdersEntity getOrdersByOrderId() {
        return ordersByOrderId;
    }

    public void setOrdersByOrderId(OrdersEntity ordersByOrderId) {
        this.ordersByOrderId = ordersByOrderId;
    }

    @Override
    public String toString() {
        return "InvoicesEntity{" +
                "id=" + id +
                /*", orderId=" + orderId +*/
                ", invoiceDate=" + invoiceDate +
                ", dueDate=" + dueDate +
                ", tax=" + tax +
                ", shipping=" + shipping +
                ", amountDue=" + amountDue +
                ", ordersByOrderId=" + ordersByOrderId.getId() +
                '}';
    }
}
