package entity.mapped_superclass;

import entity.single_table.OrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "orderstaxstatus", schema = "northwind")
public class OrderstaxstatusEntity extends Status {

    @OneToMany(mappedBy = "orderstaxstatusByTaxStatusId")
    private Collection<OrdersEntity> ordersById;

    public Collection<OrdersEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrdersEntity> ordersById) {
        this.ordersById = ordersById;
    }

    @Override
    public String toString() {
        return "OrderstaxstatusEntity{" +
                "ordersById=" + ordersById +
                '}';
    }
}
