package entity.mapped_superclass;

import entity.single_table.OrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "ordersstatus", schema = "northwind")
public class OrdersstatusEntity extends Status {

    @OneToMany(mappedBy = "ordersstatusByStatusId")
    private Collection<OrdersEntity> ordersById;

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @Override
    public String toString() {
        return "OrdersstatusEntity{" +
                "ordersById=" + ordersById +
                '}';
    }
}
