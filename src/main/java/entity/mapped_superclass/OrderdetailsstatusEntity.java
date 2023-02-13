package entity.mapped_superclass;

import entity.joined.SellorderdetailsEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class OrderdetailsstatusEntity extends StatusEntity {
    private String orderDetailsStatusEntity = "orderDetailsStatusEntity";
    @OneToMany(mappedBy = "orderdetailsstatusByStatusId")
    private Collection<SellorderdetailsEntity> sellOrderdetailsById;

    public String getOrderDetailsStatusEntity() {
        return orderDetailsStatusEntity;
    }

    public void setOrderDetailsStatusEntity(String orderDetailsStatusEntity) {
        this.orderDetailsStatusEntity = orderDetailsStatusEntity;
    }

    public Collection<SellorderdetailsEntity> getSellOrderdetailsById() {
        return sellOrderdetailsById;
    }

    public void setSellOrderdetailsById(Collection<SellorderdetailsEntity> orderdetailsById) {
        this.sellOrderdetailsById = orderdetailsById;
    }

    @Override
    public String toString() {
        return "OrderdetailsstatusEntity{" +
                "orderDetailsStatusEntity='" + orderDetailsStatusEntity + '\'' +
                ", sellOrderdetailsById=" + sellOrderdetailsById +
                '}';
    }
}
