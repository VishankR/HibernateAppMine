package entity.table_per_class;

import entity.single_table.OrdersEntity;
import entity.single_table.SellOrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class CustomersEntity extends Person{
    @OneToMany(mappedBy = "customersByCustomerId")
    private Collection<SellOrdersEntity> sellOrdersById;

    public Collection<SellOrdersEntity> getSellOrdersById() {
        return sellOrdersById;
    }

    public void setSellOrdersById(Collection<SellOrdersEntity> ordersById) {
        this.sellOrdersById = ordersById;
    }

    @Override
    public String toString() {
        return "CustomersEntity{" +
                "sellOrdersById=" + sellOrdersById +
                '}';
    }
}
