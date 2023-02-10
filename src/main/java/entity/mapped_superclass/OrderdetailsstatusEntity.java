package entity.mapped_superclass;

import entity.joined.OrderdetailsEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "orderdetailsstatus", schema = "northwind")
public class OrderdetailsstatusEntity extends Status {

    @OneToMany(mappedBy = "orderdetailsstatusByStatusId")
    private Collection<OrderdetailsEntity> orderdetailsById;

    public Collection<OrderdetailsEntity> getOrderdetailsById() {
        return orderdetailsById;
    }

    public void setOrderdetailsById(Collection<OrderdetailsEntity> orderdetailsById) {
        this.orderdetailsById = orderdetailsById;
    }

    @Override
    public String toString() {
        return "OrderdetailsstatusEntity{" +
                "orderdetailsById=" + orderdetailsById +
                '}';
    }
}
