package entity;

import entity.concrete_class.InventorytransactionsEntity;
import entity.joined.OrderdetailsEntity;
import entity.joined.PurchaseorderdetailsEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "northwind")
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
    private Collection<OrderdetailsEntity> orderdetailsById;
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
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntity that = (ProductsEntity) o;
        return id == that.id && discontinued == that.discontinued && Objects.equals(supplierIds, that.supplierIds) && Objects.equals(productCode, that.productCode) && Objects.equals(productName, that.productName) && Objects.equals(description, that.description) && Objects.equals(standardCost, that.standardCost) && Objects.equals(listPrice, that.listPrice) && Objects.equals(reorderLevel, that.reorderLevel) && Objects.equals(targetLevel, that.targetLevel) && Objects.equals(quantityPerUnit, that.quantityPerUnit) && Objects.equals(minimumReorderQuantity, that.minimumReorderQuantity) && Objects.equals(category, that.category) && Arrays.equals(attachments, that.attachments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, supplierIds, productCode, productName, description, standardCost, listPrice, reorderLevel, targetLevel, quantityPerUnit, discontinued, minimumReorderQuantity, category);
        result = 31 * result + Arrays.hashCode(attachments);
        return result;
    }

    public Collection<InventorytransactionsEntity> getInventorytransactionsById() {
        return inventorytransactionsById;
    }

    public void setInventorytransactionsById(Collection<InventorytransactionsEntity> inventorytransactionsById) {
        this.inventorytransactionsById = inventorytransactionsById;
    }

    public Collection<OrderdetailsEntity> getOrderdetailsById() {
        return orderdetailsById;
    }

    public void setOrderdetailsById(Collection<OrderdetailsEntity> orderdetailsById) {
        this.orderdetailsById = orderdetailsById;
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
                ", orderdetailsById=" + orderdetailsById +
                ", purchaseorderdetailsById=" + purchaseorderdetailsById +
                '}';
    }
}
