package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import entity.concrete_class.*;
import entity.joined.PurchaseorderdetailsEntity;
import entity.joined.SellorderdetailsEntity;
import entity.mapped_superclass.OrderdetailsstatusEntity;
import entity.mapped_superclass.OrdersstatusEntity;
import entity.mapped_superclass.OrderstaxstatusEntity;
import entity.mapped_superclass.PurchaseorderstatusEntity;
import entity.single_table.PurchaseordersEntity;
import entity.single_table.SellOrdersEntity;
import entity.table_per_class.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class DummyDataUtil {
    GsonBuilder gsonBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss");
    Gson gson = gsonBuilder.create();
    private StringBuilder FILE_PATH = new StringBuilder("D:\\\\workspaces\\\\HibernateAppMine\\\\src\\\\main\\\\resources\\\\sqlScripts\\\\data\\\\");

    private static final Type PERSON_TYPE = new TypeToken<List<PersonEntity>>() {}.getType();
    private static final Type CUSTOMER_TYPE = new TypeToken<List<CustomersEntity>>() {}.getType();
    private static final Type EMPLOYEE_TYPE = new TypeToken<List<EmployeesEntity>>() {}.getType();
    private static final Type SHIPPER_TYPE = new TypeToken<List<ShippersEntity>>() {}.getType();
    private static final Type SUPPLIER_TYPE = new TypeToken<List<SuppliersEntity>>() {}.getType();

//    private static final Type ORDER_TYPE = new TypeToken<List<OrdersEntity>>() {}.getType();
    private static final Type PURCHASE_ORDER_TYPE = new TypeToken<List<PurchaseordersEntity>>() {}.getType();
    private static final Type SELL_ORDER_TYPE = new TypeToken<List<SellOrdersEntity>>() {}.getType();

//    private static final Type STATUS_TYPE = new TypeToken<List<StatusEntity>>() {}.getType();
    private static final Type ORDER_DETAIL_STATUS_TYPE = new TypeToken<List<OrderdetailsstatusEntity>>() {}.getType();
    private static final Type ORDER_STATUS_TYPE = new TypeToken<List<OrdersstatusEntity>>() {}.getType();
    private static final Type ORDER_TAX_STATUS_TYPE = new TypeToken<List<OrderstaxstatusEntity>>() {}.getType();
    private static final Type PURCHASE_ORDER_STATUS_TYPE = new TypeToken<List<PurchaseorderstatusEntity>>() {}.getType();

//    private static final Type DETAIL_TYPE = new TypeToken<List<DetailEntity>>() {}.getType();
    private static final Type PURCHASE_ORDER_DETAIL_TYPE = new TypeToken<List<PurchaseorderdetailsEntity>>() {}.getType();
    private static final Type SELL_ORDER_DETAIL_TYPE = new TypeToken<List<SellorderdetailsEntity>>() {}.getType();

    private static final Type INVENTORY_TRANSACTION_TYPE = new TypeToken<List<InventorytransactionsEntity>>() {}.getType();
    private static final Type INVENTORY_TRANSACTION_TYPE_TYPE = new TypeToken<List<InventorytransactiontypesEntity>>() {}.getType();
    private static final Type INVOICE_TYPE = new TypeToken<List<InvoicesEntity>>() {}.getType();
    private static final Type PRODUCT_TYPE = new TypeToken<List<ProductsEntity>>() {}.getType();
    private static final Type STRING_TYPE = new TypeToken<List<StringsEntity>>() {}.getType();

/*    public List<PersonEntity> insertDummyPerson() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "person.json"));
        List<PersonEntity> personEntities =(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(personEntities);
        return personEntities;
    }*/

    public List<CustomersEntity> insertDummyCustomers() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "customers.json"));
        List<CustomersEntity> customersEntities =(List<CustomersEntity>)gson.fromJson(br,CUSTOMER_TYPE);
        System.out.println(customersEntities);
        return customersEntities;
    }

    public List<EmployeesEntity> insertDummyEmployees() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "employees.json"));
        List<EmployeesEntity> employeesEntities =(List<EmployeesEntity>)gson.fromJson(br,EMPLOYEE_TYPE);
        System.out.println(employeesEntities);
        return employeesEntities;
    }

    public List<ShippersEntity> insertDummyShippers() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "shippers.json"));
        List<ShippersEntity> shippersEntities =(List<ShippersEntity>)gson.fromJson(br,SHIPPER_TYPE);
        System.out.println(shippersEntities);
        return shippersEntities;
    }

    public List<SuppliersEntity> insertDummySuppliers() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "suppliers.json"));
        List<SuppliersEntity> suppliersEntities =(List<SuppliersEntity>)gson.fromJson(br,SUPPLIER_TYPE);
        System.out.println(suppliersEntities);
        return suppliersEntities;
    }

/*    public void insertDummyOrders() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "customers.json"));
        List<PersonEntity> persons=(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(persons);
    }*/

    public List<SellOrdersEntity> insertDummySellOrders() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "sellOrders.json"));
        List<SellOrdersEntity> sellOrdersEntities =(List<SellOrdersEntity>)gson.fromJson(br,SELL_ORDER_TYPE );
        System.out.println(sellOrdersEntities);
        return sellOrdersEntities;
    }

    public List<PurchaseordersEntity> insertDummyPurchaseOrders() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "purchaseorders.json"));
        List<PurchaseordersEntity> purchaseordersEntities =(List<PurchaseordersEntity>)gson.fromJson(br,PURCHASE_ORDER_TYPE);
        System.out.println(purchaseordersEntities);
        return purchaseordersEntities;
    }

/*    public void insertDummyDetails() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "customers.json"));
        List<PersonEntity> persons=(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(persons);
    }*/

    public List<SellorderdetailsEntity> insertDummySellOrdersDetails() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "sellOrderdetails.json"));
        List<SellorderdetailsEntity> sellorderdetailsEntities =(List<SellorderdetailsEntity>)gson.fromJson(br,SELL_ORDER_DETAIL_TYPE);
        System.out.println(sellorderdetailsEntities);
        return sellorderdetailsEntities;
    }

    public List<PurchaseorderdetailsEntity> insertDummyPurchaseOrdersDetails() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "purchaseorderdetails.json"));
        List<PurchaseorderdetailsEntity> purchaseorderdetailsEntities =(List<PurchaseorderdetailsEntity>)gson.fromJson(br,PURCHASE_ORDER_DETAIL_TYPE);
        System.out.println(purchaseorderdetailsEntities);
        return purchaseorderdetailsEntities;
    }

    public List<InventorytransactionsEntity> insertDummyInventoryTransactions() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "inventorytransactions.json"));
        List<InventorytransactionsEntity> inventorytransactionsEntities =(List<InventorytransactionsEntity>)gson.fromJson(br,INVENTORY_TRANSACTION_TYPE);
        System.out.println(inventorytransactionsEntities);
        return inventorytransactionsEntities;
    }

    public List<InventorytransactiontypesEntity> insertDummyInventoryTransactionsTypes() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "inventorytransactiontypes.json"));
        List<InventorytransactiontypesEntity> inventorytransactiontypesEntities =(List<InventorytransactiontypesEntity>)gson.fromJson(br,INVENTORY_TRANSACTION_TYPE_TYPE);
        System.out.println(inventorytransactiontypesEntities);
        return inventorytransactiontypesEntities;
    }

    public List<InvoicesEntity> insertDummyInvoices() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "invoices.json"));
        List<InvoicesEntity> invoicesEntities =(List<InvoicesEntity>)gson.fromJson(br,INVOICE_TYPE);
        System.out.println(invoicesEntities);
        return invoicesEntities;
    }

    public List<ProductsEntity> insertDummyProducts() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "products.json"));
        List<ProductsEntity> productsEntities =(List<ProductsEntity>)gson.fromJson(br,PRODUCT_TYPE);
        System.out.println(productsEntities);
        return productsEntities;
    }

    public List<StringsEntity> insertDummyStrings() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "strings.json"));
        List<StringsEntity> stringsEntities =(List<StringsEntity>)gson.fromJson(br,STRING_TYPE);
        System.out.println(stringsEntities);
        return stringsEntities;
    }

/*    public void insertDummyStatuses() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "customers.json"));
        List<PersonEntity> persons=(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(persons);
    }*/

    public List<OrderdetailsstatusEntity> insertDummyOrderDetailsStatus() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "orderdetailsstatus.json"));
        List<OrderdetailsstatusEntity> orderdetailsstatusEntities =(List<OrderdetailsstatusEntity>)gson.fromJson(br,ORDER_DETAIL_STATUS_TYPE);
        System.out.println(orderdetailsstatusEntities);
        return orderdetailsstatusEntities;
    }

    public List<OrdersstatusEntity> insertDummyOrdersStatus() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "ordersstatus.json"));
        List<OrdersstatusEntity> ordersstatusEntities =(List<OrdersstatusEntity>)gson.fromJson(br,ORDER_STATUS_TYPE);
        System.out.println(ordersstatusEntities);
        return ordersstatusEntities;
    }

    public List<OrderstaxstatusEntity> insertDummyOrdersTaxStatus() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "orderstaxstatus.json"));
        List<OrderstaxstatusEntity> orderstaxstatusEntities =(List<OrderstaxstatusEntity>)gson.fromJson(br,ORDER_TAX_STATUS_TYPE);
        System.out.println(orderstaxstatusEntities);
        return orderstaxstatusEntities;
    }

    public List<PurchaseorderstatusEntity> insertDummyPurchaseOrderStatus() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader(FILE_PATH + "purchaseorderstatus.json"));
        List<PurchaseorderstatusEntity> purchaseorderstatusEntities =(List<PurchaseorderstatusEntity>)gson.fromJson(br,PURCHASE_ORDER_STATUS_TYPE);
        System.out.println(purchaseorderstatusEntities);
        return purchaseorderstatusEntities;
    }

    public void createDummyData() throws FileNotFoundException {
        CustomersEntity anna = new CustomersEntity();
    }

    public void getCustomers() throws FileNotFoundException {
        CustomersEntity anna = new CustomersEntity();
        anna.setDType();
        anna.setCompany("Company A");
        anna.setLastName("Bedecs");
        anna.setFirstName("Anna");
        anna.setEmailAddress("Anna@1");
        anna.setJobTitle("Owner");
        anna.setBusinessPhone("(123)555-0100");
        anna.setHomePhone("(123)555-0101");
        anna.setMobilePhone("(123)555-0102");
        anna.setFaxNumber("(123)555-0103");
        anna.setAddress("123 1st Street");
        anna.setCity("Seattle");
        anna.setStateProvince("WA");
        anna.setZipPostalCode("99999");
        anna.setCountryRegion("USA");

        EmployeesEntity annaEmployee = new EmployeesEntity();
        annaEmployee.setDType();
        annaEmployee.setCompany("Northwind Traders");
        annaEmployee.setLastName("Freehafer");
        annaEmployee.setFirstName("Nancy");
        annaEmployee.setEmailAddress("nancy@northwindtraders.com");
        annaEmployee.setJobTitle("Sales Representative");
        annaEmployee.setBusinessPhone("(123)555-0100");
        annaEmployee.setHomePhone("(123)555-0101");
        annaEmployee.setMobilePhone("(123)555-0102");
        annaEmployee.setFaxNumber("(123)555-0103");
        annaEmployee.setAddress("123 1st Avenue");
        annaEmployee.setCity("Seattle");
        annaEmployee.setStateProvince("WA");
        annaEmployee.setZipPostalCode("99999");
        annaEmployee.setCountryRegion("USA");
        annaEmployee.setWebPage("#http://northwindtraders.com#");

        ShippersEntity shipper1 = new ShippersEntity();
        shipper1.setDType();
        shipper1.setCompany("Shipping Company A");
        shipper1.setAddress("123 Any Street");
        shipper1.setCity("Memphis");
        shipper1.setStateProvince("TIN");
        shipper1.setZipPostalCode("99999");
        shipper1.setCountryRegion("USA");

        SellOrdersEntity annaSellOrder = new SellOrdersEntity();
        annaSellOrder.setDType();
        LocalDateTime localDateTime = LocalDateTime.parse("2006-03-24 00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        annaSellOrder.setOrderDate(new Timestamp(localDateTime.toInstant(OffsetDateTime.now().getOffset()).toEpochMilli()));
        annaSellOrder.setShipName("Anna Bedecs");
        annaSellOrder.setShipAddress("123 1st Street");
        annaSellOrder.setShipCity("Seattle");
        annaSellOrder.setShipStateProvince("WA");
        annaSellOrder.setShipZipPostalCode("99999");
        annaSellOrder.setShipCountryRegion("USA");
        annaSellOrder.setShippingFee(new BigDecimal(0));
        annaSellOrder.setTaxes(new BigDecimal(0));
        annaSellOrder.setTaxRate(new Double(0));

        OrdersstatusEntity ordersstatusEntity = new OrdersstatusEntity();
        ordersstatusEntity.setDType();
        ordersstatusEntity.setStatus("New");

/*        ShippersEntity shipper3 = new ShippersEntity();
        shipper3.setDType();
        shipper3.setCompany("Shipping Company C");
        shipper3.setAddress("123 Any Street");
        shipper3.setCity("Memphis");
        shipper3.setStateProvince("TIN");
        shipper3.setZipPostalCode("99999");
        shipper3.setCountryRegion("USA");*/
    }

}
