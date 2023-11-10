package entity.mapped_superclass;

import entity.joined.SellorderdetailsEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class OrderdetailsstatusEntity extends StatusEntity {
    @OneToMany(mappedBy = "orderdetailsstatusByStatusId")
    private Collection<SellorderdetailsEntity> sellOrderdetailsById;

    public OrderdetailsstatusEntity() {
       this.setDType(this.getClass().getName());
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
                ", sellOrderdetailsById=" + sellOrderdetailsById +
                '}';
    }
}
