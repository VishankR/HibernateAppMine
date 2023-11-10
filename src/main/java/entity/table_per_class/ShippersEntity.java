package entity.table_per_class;

import entity.single_table.SellOrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class ShippersEntity extends PersonEntity {
    @OneToMany(mappedBy = "shippersByShipperId")
    private Collection<SellOrdersEntity> sellOrdersById;

    public ShippersEntity() {
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
        return "ShippersEntity{" +
                ", sellOrdersById=" + sellOrdersById +
                '}';
    }
}
