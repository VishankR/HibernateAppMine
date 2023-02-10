package entity.table_per_class;

import entity.single_table.OrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "customers", schema = "northwind")
public class CustomersEntity extends Person{
    @OneToMany(mappedBy = "customersByCustomerId")
    private Collection<OrdersEntity> ordersById;

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @Override
    public String toString() {
        return "CustomersEntity{" +
                " ordersById=" + ordersById +
                '}';
    }
}
