package entity.mapped_superclass;

import entity.single_table.SellOrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class OrdersstatusEntity extends StatusEntity {
    private String ordersStatusEntity = "OrdersStatusEntity";
    @OneToMany(mappedBy = "ordersstatusByStatusId")
    private Collection<SellOrdersEntity> sellOrdersById;

    public String getOrdersStatusEntity() {
        return ordersStatusEntity;
    }

    public void setOrdersStatusEntity(String ordersStatusEntity) {
        this.ordersStatusEntity = ordersStatusEntity;
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
                "ordersStatusEntity='" + ordersStatusEntity + '\'' +
                ", sellOrdersById=" + sellOrdersById +
                '}';
    }
}
