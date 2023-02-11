package entity.table_per_class;

import entity.single_table.SellOrdersEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class CustomersEntity extends Person{
    private String customersEntity = "CustomersEntity";
    @OneToMany(mappedBy = "customersByCustomerId")
    private Collection<SellOrdersEntity> sellOrdersById;

    public String getCustomersEntity() {
        return customersEntity;
    }

    public void setCustomersEntity(String customersEntity) {
        this.customersEntity = customersEntity;
    }

    public Collection<SellOrdersEntity> getSellOrdersById() {
        return sellOrdersById;
    }

    public void setSellOrdersById(Collection<SellOrdersEntity> ordersById) {
        this.sellOrdersById = ordersById;
    }

    @Override
    public String toString() {
        return "CustomersEntity{" +
                "customersEntity='" + customersEntity + '\'' +
                ", sellOrdersById=" + sellOrdersById +
                '}';
    }
}
