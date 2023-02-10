package entity.concrete_class;

import entity.joined.SellorderdetailsEntity;
import entity.joined.PurchaseorderdetailsEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class ProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String supplierIds;
    private String productCode;
    private String productName;
    private String description;
    private BigDecimal standardCost;
    private BigDecimal listPrice;
    private Integer reorderLevel;
    private Integer targetLevel;
    private String quantityPerUnit;
    private byte discontinued;
    private Integer minimumReorderQuantity;
    private String category;
    private byte[] attachments;
    @OneToMany(mappedBy = "productsByProductId")
    private Collection<InventorytransactionsEntity> inventorytransactionsById;
    @OneToMany(mappedBy = "productsByProductId")
    private Collection<SellorderdetailsEntity> sellOrderdetailsById;
    @OneToMany(mappedBy = "productsByProductId")
    private Collection<PurchaseorderdetailsEntity> purchaseorderdetailsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupplierIds() {
        return supplierIds;
    }

    public void setSupplierIds(String supplierIds) {
        this.supplierIds = supplierIds;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(BigDecimal standardCost) {
        this.standardCost = standardCost;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public Integer getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Integer reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public Integer getTargetLevel() {
        return targetLevel;
    }

    public void setTargetLevel(Integer targetLevel) {
        this.targetLevel = targetLevel;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public byte getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(byte discontinued) {
        this.discontinued = discontinued;
    }

    public Integer getMinimumReorderQuantity() {
        return minimumReorderQuantity;
    }

    public void setMinimumReorderQuantity(Integer minimumReorderQuantity) {
        this.minimumReorderQuantity = minimumReorderQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public byte[] getAttachments() {
        return attachments;
    }

    public void setAttachments(byte[] attachments) {
        this.attachments = attachments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductsEntity)) return false;
        ProductsEntity that = (ProductsEntity) o;
        return getId() == that.getId() && getDiscontinued() == that.getDiscontinued() && Objects.equals(getSupplierIds(), that.getSupplierIds()) && Objects.equals(getProductCode(), that.getProductCode()) && Objects.equals(getProductName(), that.getProductName()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getStandardCost(), that.getStandardCost()) && Objects.equals(getListPrice(), that.getListPrice()) && Objects.equals(getReorderLevel(), that.getReorderLevel()) && Objects.equals(getTargetLevel(), that.getTargetLevel()) && Objects.equals(getQuantityPerUnit(), that.getQuantityPerUnit()) && Objects.equals(getMinimumReorderQuantity(), that.getMinimumReorderQuantity()) && Objects.equals(getCategory(), that.getCategory()) && Arrays.equals(getAttachments(), that.getAttachments()) && Objects.equals(getInventorytransactionsById(), that.getInventorytransactionsById()) && Objects.equals(getSellOrderdetailsById(), that.getSellOrderdetailsById()) && Objects.equals(getPurchaseorderdetailsById(), that.getPurchaseorderdetailsById());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getId(), getSupplierIds(), getProductCode(), getProductName(), getDescription(), getStandardCost(), getListPrice(), getReorderLevel(), getTargetLevel(), getQuantityPerUnit(), getDiscontinued(), getMinimumReorderQuantity(), getCategory(), getInventorytransactionsById(), getSellOrderdetailsById(), getPurchaseorderdetailsById());
        result = 31 * result + Arrays.hashCode(getAttachments());
        return result;
    }

    public Collection<InventorytransactionsEntity> getInventorytransactionsById() {
        return inventorytransactionsById;
    }

    public void setInventorytransactionsById(Collection<InventorytransactionsEntity> inventorytransactionsById) {
        this.inventorytransactionsById = inventorytransactionsById;
    }

    public Collection<SellorderdetailsEntity> getSellOrderdetailsById() {
        return sellOrderdetailsById;
    }

    public void setSellOrderdetailsById(Collection<SellorderdetailsEntity> sellOrderdetailsById) {
        this.sellOrderdetailsById = sellOrderdetailsById;
    }

    public Collection<PurchaseorderdetailsEntity> getPurchaseorderdetailsById() {
        return purchaseorderdetailsById;
    }

    public void setPurchaseorderdetailsById(Collection<PurchaseorderdetailsEntity> purchaseorderdetailsById) {
        this.purchaseorderdetailsById = purchaseorderdetailsById;
    }

    @Override
    public String toString() {
        return "ProductsEntity{" +
                "id=" + id +
                ", supplierIds='" + supplierIds + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", standardCost=" + standardCost +
                ", listPrice=" + listPrice +
                ", reorderLevel=" + reorderLevel +
                ", targetLevel=" + targetLevel +
                ", quantityPerUnit='" + quantityPerUnit + '\'' +
                ", discontinued=" + discontinued +
                ", minimumReorderQuantity=" + minimumReorderQuantity +
                ", category='" + category + '\'' +
                ", attachments=" + Arrays.toString(attachments) +
                ", inventorytransactionsById=" + inventorytransactionsById +
                ", sellOrderdetailsById=" + sellOrderdetailsById +
                ", purchaseorderdetailsById=" + purchaseorderdetailsById +
                '}';
    }
}
