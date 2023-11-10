package entity.single_table;

import entity.table_per_class.EmployeesEntity;
import entity.table_per_class.SuppliersEntity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@DiscriminatorValue("PURCHASE")
public class PurchaseordersEntity extends OrdersEntity {
    private Timestamp submittedDate;
    private Timestamp creationDate;
    private Timestamp expectedDate;
    private BigDecimal paymentAmount;
    private Integer approvedBy;
    private Timestamp approvedDate;
    private Integer submittedBy;
    @ManyToOne
    @JoinColumn(name = "supplierId", referencedColumnName = "id")
    private SuppliersEntity suppliersBySupplierId;
    @ManyToOne
    @JoinColumn(name = "createdBy", referencedColumnName = "id")
    private EmployeesEntity employeesByCreatedBy;

    public PurchaseordersEntity() {
        this.setDType(this.getClass().getName());
    }

    public Timestamp getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(Timestamp submittedDate) {
        this.submittedDate = submittedDate;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Timestamp expectedDate) {
        this.expectedDate = expectedDate;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Integer getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Integer approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Timestamp getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Timestamp approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Integer getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(Integer submittedBy) {
        this.submittedBy = submittedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseordersEntity)) return false;
        if (!super.equals(o)) return false;
        PurchaseordersEntity that = (PurchaseordersEntity) o;
        return Objects.equals(getSubmittedDate(), that.getSubmittedDate()) && Objects.equals(getCreationDate(), that.getCreationDate()) && Objects.equals(getExpectedDate(), that.getExpectedDate()) && Objects.equals(getPaymentAmount(), that.getPaymentAmount()) && Objects.equals(getApprovedBy(), that.getApprovedBy()) && Objects.equals(getApprovedDate(), that.getApprovedDate()) && Objects.equals(getSubmittedBy(), that.getSubmittedBy()) && Objects.equals(getDType(), that.getDType()) && Objects.equals(getSuppliersBySupplierId(), that.getSuppliersBySupplierId()) && Objects.equals(getEmployeesByCreatedBy(), that.getEmployeesByCreatedBy());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSubmittedDate(), getCreationDate(), getExpectedDate(), getPaymentAmount(), getApprovedBy(), getApprovedDate(), getSubmittedBy(), getDType(), getSuppliersBySupplierId(), getEmployeesByCreatedBy());
    }

    public SuppliersEntity getSuppliersBySupplierId() {
        return suppliersBySupplierId;
    }

    public void setSuppliersBySupplierId(SuppliersEntity suppliersBySupplierId) {
        this.suppliersBySupplierId = suppliersBySupplierId;
    }

    public EmployeesEntity getEmployeesByCreatedBy() {
        return employeesByCreatedBy;
    }

    public void setEmployeesByCreatedBy(EmployeesEntity employeesByCreatedBy) {
        this.employeesByCreatedBy = employeesByCreatedBy;
    }

    @Override
    public String toString() {
        return "PurchaseordersEntity{" +
                "submittedDate=" + submittedDate +
                ", creationDate=" + creationDate +
                ", expectedDate=" + expectedDate +
                ", paymentAmount=" + paymentAmount +
                ", approvedBy=" + approvedBy +
                ", approvedDate=" + approvedDate +
                ", submittedBy=" + submittedBy +
                ", suppliersBySupplierId=" + suppliersBySupplierId +
                ", employeesByCreatedBy=" + employeesByCreatedBy +
                '}';
    }
}
