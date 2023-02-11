package entity.joined;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * The joined table approach maps each class of the inheritance hierarchy to its own database table. This sounds similar to the
 * table per class strategy. But this time, also the abstract superclass gets mapped to a database table.
 * This table contains columns for all shared entity attributes. The tables of the subclasses are much smaller than in the
 * table per class strategy. They hold only the columns specific for the mapped entity class and a primary key with the same value
 * as the record in the table of the superclass.
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class DetailEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private Integer orderId;

    private BigDecimal quantity;

    private BigDecimal unitPrice;

    private Integer inventoryId;

    private String detailEntity = "DetailEntity";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getDetailEntity() {
        return detailEntity;
    }

    public void setDetailEntity(String detailEntity) {
        this.detailEntity = detailEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetailEntity)) return false;
        DetailEntity that = (DetailEntity) o;
        return getId() == that.getId() && Objects.equals(getOrderId(), that.getOrderId()) && Objects.equals(getQuantity(), that.getQuantity()) && Objects.equals(getUnitPrice(), that.getUnitPrice()) && Objects.equals(getInventoryId(), that.getInventoryId()) && Objects.equals(getDetailEntity(), that.getDetailEntity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOrderId(), getQuantity(), getUnitPrice(), getInventoryId(), getDetailEntity());
    }

    @Override
    public String toString() {
        return "DetailEntity{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", inventoryId=" + inventoryId +
                ", detailEntity='" + detailEntity + '\'' +
                '}';
    }
}
