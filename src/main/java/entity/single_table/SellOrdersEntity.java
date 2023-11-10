package entity.single_table;

import entity.concrete_class.InvoicesEntity;
import entity.mapped_superclass.OrderstaxstatusEntity;
import entity.table_per_class.CustomersEntity;
import entity.table_per_class.EmployeesEntity;
import entity.table_per_class.ShippersEntity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@DiscriminatorValue("SELL")
public class SellOrdersEntity extends OrdersEntity{
    private Timestamp shippedDate;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipStateProvince;
    private String shipZipPostalCode;
    private String shipCountryRegion;
    private Double taxRate;
    @OneToMany(mappedBy = "sellOrdersByOrderId")
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

    public SellOrdersEntity() {
        this.setDType(this.getClass().getName());
    }

    public Timestamp getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Timestamp shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipStateProvince() {
        return shipStateProvince;
    }

    public void setShipStateProvince(String shipStateProvince) {
        this.shipStateProvince = shipStateProvince;
    }

    public String getShipZipPostalCode() {
        return shipZipPostalCode;
    }

    public void setShipZipPostalCode(String shipZipPostalCode) {
        this.shipZipPostalCode = shipZipPostalCode;
    }

    public String getShipCountryRegion() {
        return shipCountryRegion;
    }

    public void setShipCountryRegion(String shipCountryRegion) {
        this.shipCountryRegion = shipCountryRegion;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Collection<InvoicesEntity> getInvoicesById() {
        return invoicesById;
    }

    public void setInvoicesById(Collection<InvoicesEntity> invoicesById) {
        this.invoicesById = invoicesById;
    }

    public EmployeesEntity getEmployeesByEmployeeId() {
        return employeesByEmployeeId;
    }

    public void setEmployeesByEmployeeId(EmployeesEntity employeesByEmployeeId) {
        this.employeesByEmployeeId = employeesByEmployeeId;
    }

    public CustomersEntity getCustomersByCustomerId() {
        return customersByCustomerId;
    }

    public void setCustomersByCustomerId(CustomersEntity customersByCustomerId) {
        this.customersByCustomerId = customersByCustomerId;
    }

    public ShippersEntity getShippersByShipperId() {
        return shippersByShipperId;
    }

    public void setShippersByShipperId(ShippersEntity shippersByShipperId) {
        this.shippersByShipperId = shippersByShipperId;
    }

    public OrderstaxstatusEntity getOrderstaxstatusByTaxStatusId() {
        return orderstaxstatusByTaxStatusId;
    }

    public void setOrderstaxstatusByTaxStatusId(OrderstaxstatusEntity orderstaxstatusByTaxStatusId) {
        this.orderstaxstatusByTaxStatusId = orderstaxstatusByTaxStatusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SellOrdersEntity)) return false;
        if (!super.equals(o)) return false;
        SellOrdersEntity that = (SellOrdersEntity) o;
        return Objects.equals(getShippedDate(), that.getShippedDate()) && Objects.equals(getShipName(), that.getShipName()) && Objects.equals(getShipAddress(), that.getShipAddress()) && Objects.equals(getShipCity(), that.getShipCity()) && Objects.equals(getShipStateProvince(), that.getShipStateProvince()) && Objects.equals(getShipZipPostalCode(), that.getShipZipPostalCode()) && Objects.equals(getShipCountryRegion(), that.getShipCountryRegion()) && Objects.equals(getTaxRate(), that.getTaxRate()) && Objects.equals(getDType(), that.getDType()) && Objects.equals(getInvoicesById(), that.getInvoicesById()) && Objects.equals(getEmployeesByEmployeeId(), that.getEmployeesByEmployeeId()) && Objects.equals(getCustomersByCustomerId(), that.getCustomersByCustomerId()) && Objects.equals(getShippersByShipperId(), that.getShippersByShipperId()) && Objects.equals(getOrderstaxstatusByTaxStatusId(), that.getOrderstaxstatusByTaxStatusId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getShippedDate(), getShipName(), getShipAddress(), getShipCity(), getShipStateProvince(), getShipZipPostalCode(), getShipCountryRegion(), getTaxRate(), getDType(), getInvoicesById(), getEmployeesByEmployeeId(), getCustomersByCustomerId(), getShippersByShipperId(), getOrderstaxstatusByTaxStatusId());
    }

    @Override
    public String toString() {
        return "SellOrdersEntity{" +
                "shippedDate=" + shippedDate +
                ", shipName='" + shipName + '\'' +
                ", shipAddress='" + shipAddress + '\'' +
                ", shipCity='" + shipCity + '\'' +
                ", shipStateProvince='" + shipStateProvince + '\'' +
                ", shipZipPostalCode='" + shipZipPostalCode + '\'' +
                ", shipCountryRegion='" + shipCountryRegion + '\'' +
                ", taxRate=" + taxRate +
                ", invoicesById=" + invoicesById +
                ", employeesByEmployeeId=" + employeesByEmployeeId +
                ", customersByCustomerId=" + customersByCustomerId +
                ", shippersByShipperId=" + shippersByShipperId +
                ", orderstaxstatusByTaxStatusId=" + orderstaxstatusByTaxStatusId +
                '}';
    }
}
