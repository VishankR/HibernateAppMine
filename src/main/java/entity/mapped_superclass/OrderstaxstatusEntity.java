package entity.mapped_superclass;

import entity.single_table.SellOrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class OrderstaxstatusEntity extends StatusEntity {
    private String ordersTaxStatusEntity = "OrdersTaxStatusEntity";
    @OneToMany(mappedBy = "orderstaxstatusByTaxStatusId")
    private Collection<SellOrdersEntity> sellOrdersById;

    public String getOrdersTaxStatusEntity() {
        return ordersTaxStatusEntity;
    }

    public void setOrdersTaxStatusEntity(String ordersTaxStatusEntity) {
        this.ordersTaxStatusEntity = ordersTaxStatusEntity;
    }

    public Collection<SellOrdersEntity> getSellOrdersById() {
        return sellOrdersById;
    }

    public void setSellOrdersById(Collection<SellOrdersEntity> ordersById) {
        this.sellOrdersById = ordersById;
    }

    @Override
    public String toString() {
        return "OrderstaxstatusEntity{" +
                "ordersTaxStatusEntity='" + ordersTaxStatusEntity + '\'' +
                ", sellOrdersById=" + sellOrdersById +
                '}';
    }
}
