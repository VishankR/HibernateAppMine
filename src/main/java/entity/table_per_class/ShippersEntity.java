package entity.table_per_class;

import entity.single_table.OrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "shippers", schema = "northwind")
public class ShippersEntity extends Person {
    @OneToMany(mappedBy = "shippersByShipperId")
    private Collection<OrdersEntity> ordersById;

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @Override
    public String toString() {
        return "ShippersEntity{" +
                "ordersById=" + ordersById +
                '}';
    }
}
