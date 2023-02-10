package entity.mapped_superclass;

import entity.joined.SellorderdetailsEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class OrderdetailsstatusEntity extends Status {

    @OneToMany(mappedBy = "orderdetailsstatusByStatusId")
    private Collection<SellorderdetailsEntity> sellOrderdetailsById;

    public Collection<SellorderdetailsEntity> getSellOrderdetailsById() {
        return sellOrderdetailsById;
    }

    public void setSellOrderdetailsById(Collection<SellorderdetailsEntity> orderdetailsById) {
        this.sellOrderdetailsById = orderdetailsById;
    }

    @Override
    public String toString() {
        return "OrderdetailsstatusEntity{" +
                "sellOrderdetailsById=" + sellOrderdetailsById +
                '}';
    }
}
