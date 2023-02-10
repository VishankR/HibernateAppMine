package entity.table_per_class;

import entity.single_table.OrdersEntity;
import entity.single_table.PurchaseordersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "employees", schema = "northwind")
public class EmployeesEntity extends Person {
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<OrdersEntity> ordersById;
    @OneToMany(mappedBy = "employeesByCreatedBy")
    private Collection<PurchaseordersEntity> purchaseordersById;

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    public Collection<PurchaseordersEntity> getPurchaseordersById() {
        return purchaseordersById;
    }

    public void setPurchaseordersById(Collection<PurchaseordersEntity> purchaseordersById) {
        this.purchaseordersById = purchaseordersById;
    }

    @Override
    public String toString() {
        return "EmployeesEntity{" +
                " ordersById=" + ordersById +
                ", purchaseordersById=" + purchaseordersById +
                '}';
    }
}
