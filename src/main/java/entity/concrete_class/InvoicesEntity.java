package entity.concrete_class;

import entity.single_table.OrdersEntity;
import entity.single_table.SellOrdersEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
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
    private SellOrdersEntity sellOrdersByOrderId;

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
        if (!(o instanceof InvoicesEntity)) return false;
        InvoicesEntity that = (InvoicesEntity) o;
        return getId() == that.getId() && Objects.equals(getInvoiceDate(), that.getInvoiceDate()) && Objects.equals(getDueDate(), that.getDueDate()) && Objects.equals(getTax(), that.getTax()) && Objects.equals(getShipping(), that.getShipping()) && Objects.equals(getAmountDue(), that.getAmountDue()) && Objects.equals(getSellOrdersByOrderId(), that.getSellOrdersByOrderId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getInvoiceDate(), getDueDate(), getTax(), getShipping(), getAmountDue(), getSellOrdersByOrderId());
    }

    public OrdersEntity getSellOrdersByOrderId() {
        return sellOrdersByOrderId;
    }

    public void setSellOrdersByOrderId(SellOrdersEntity sellOrdersByOrderId) {
        this.sellOrdersByOrderId = sellOrdersByOrderId;
    }

    @Override
    public String toString() {
        return "InvoicesEntity{" +
                "id=" + id +
                ", invoiceDate=" + invoiceDate +
                ", dueDate=" + dueDate +
                ", tax=" + tax +
                ", shipping=" + shipping +
                ", amountDue=" + amountDue +
                ", sellOrdersByOrderId=" + sellOrdersByOrderId +
                '}';
    }
}
