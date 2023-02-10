package entity.single_table;

import entity.concrete_class.InvoicesEntity;
import entity.mapped_superclass.OrderstaxstatusEntity;
import entity.table_per_class.CustomersEntity;
import entity.table_per_class.EmployeesEntity;
import entity.table_per_class.ShippersEntity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.util.Collection;

public class SellOrdersEntity extends OrdersEntity{
    private Timestamp shippedDate;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipStateProvince;
    private String shipZipPostalCode;
    private String shipCountryRegion;
    private Double taxRate;
    @OneToMany(mappedBy = "ordersByOrderId")
    private Collection<InvoicesEntity> invoicesById;
    @ManyToOne
    @JoinColumn(name = "employeeId", referencedColumnName = "id")
    private EmployeesEntity employeesByEmployeeId;
    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    private CustomersEntity customersByCustomerId;
    @ManyToOne
    @JoinColumn(name = "shipperId", referencedColumnName = "id")
    private ShippersEntity shippersByShipperId;
    @ManyToOne
    @JoinColumn(name = "taxStatusId", referencedColumnName = "id")
    private OrderstaxstatusEntity orderstaxstatusByTaxStatusId;
}
