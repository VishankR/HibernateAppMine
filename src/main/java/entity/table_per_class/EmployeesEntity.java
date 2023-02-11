package entity.table_per_class;

import entity.single_table.OrdersEntity;
import entity.single_table.PurchaseordersEntity;
import entity.single_table.SellOrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class EmployeesEntity extends Person {
    private String employeesEntity = "EmployeesEntity";
    @OneToMany(mappedBy = "employeesByEmployeeId")
    private Collection<SellOrdersEntity> sellOrdersById;
    @OneToMany(mappedBy = "employeesByCreatedBy")
    private Collection<PurchaseordersEntity> purchaseordersById;

    public String getEmployeesEntity() {
        return employeesEntity;
    }

    public void setEmployeesEntity(String employeesEntity) {
        this.employeesEntity = employeesEntity;
    }

    public Collection<SellOrdersEntity> getSellOrdersById() {
        return sellOrdersById;
    }

    public void setSellOrdersById(Collection<SellOrdersEntity> ordersById) {
        this.sellOrdersById = ordersById;
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
                "employeesEntity='" + employeesEntity + '\'' +
                ", sellOrdersById=" + sellOrdersById +
                ", purchaseordersById=" + purchaseordersById +
                '}';
    }
}
