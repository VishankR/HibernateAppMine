package entity.mapped_superclass;

import entity.single_table.SellOrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class OrdersstatusEntity extends StatusEntity {
    @OneToMany(mappedBy = "ordersstatusByStatusId")
    private Collection<SellOrdersEntity> sellOrdersById;

    public OrdersstatusEntity() {
        this.setDType(this.getClass().getName());
    }

    public Collection<SellOrdersEntity> getSellOrdersById() {
        return sellOrdersById;
    }

    public void setSellOrdersById(Collection<SellOrdersEntity> ordersById) {
        this.sellOrdersById = ordersById;
    }

    @Override
    public String toString() {
        return "OrdersstatusEntity{" +
                ", sellOrdersById=" + sellOrdersById +
                '}';
    }
}
