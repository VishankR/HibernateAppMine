package entity.table_per_class;

import entity.single_table.SellOrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class ShippersEntity extends PersonEntity {
    private String shippersEntity = "ShippersEntity";
    @OneToMany(mappedBy = "shippersByShipperId")
    private Collection<SellOrdersEntity> sellOrdersById;

    public Collection<SellOrdersEntity> getSellOrdersById() {
        return sellOrdersById;
    }

    public void setSellOrdersById(Collection<SellOrdersEntity> ordersById) {
        this.sellOrdersById = ordersById;
    }

    public String getShippersEntity() {
        return shippersEntity;
    }

    public void setShippersEntity(String shippersEntity) {
        this.shippersEntity = shippersEntity;
    }

    @Override
    public String toString() {
        return "ShippersEntity{" +
                "shippersEntity='" + shippersEntity + '\'' +
                ", sellOrdersById=" + sellOrdersById +
                '}';
    }
}
