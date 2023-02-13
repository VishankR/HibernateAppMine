package utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import entity.concrete_class.*;
import entity.joined.DetailEntity;
import entity.joined.PurchaseorderdetailsEntity;
import entity.joined.SellorderdetailsEntity;
import entity.mapped_superclass.*;
import entity.single_table.OrdersEntity;
import entity.single_table.PurchaseordersEntity;
import entity.single_table.SellOrdersEntity;
import entity.table_per_class.PersonEntity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class DummyDataUtil {
    GsonBuilder gsonBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss");
    Gson gson = gsonBuilder.create();

    private static final Type PERSON_TYPE = new TypeToken<List<PersonEntity>>() {}.getType();
//    private static final Type CUSTOMER_TYPE = new TypeToken<List<PersonEntity>>() {}.getType();
//    private static final Type EMPLOYEE_TYPE = new TypeToken<List<PersonEntity>>() {}.getType();
//    private static final Type SHIPPER_TYPE = new TypeToken<List<PersonEntity>>() {}.getType();
//    private static final Type SUPPLIER_TYPE = new TypeToken<List<PersonEntity>>() {}.getType();

    private static final Type ORDER_TYPE = new TypeToken<List<OrdersEntity>>() {}.getType();
    private static final Type PURCHASE_ORDER_TYPE = new TypeToken<List<PurchaseordersEntity>>() {}.getType();
    private static final Type SELL_ORDER_TYPE = new TypeToken<List<SellOrdersEntity>>() {}.getType();

    private static final Type STATUS_TYPE = new TypeToken<List<StatusEntity>>() {}.getType();
    private static final Type ORDER_DETAIL_STATUS_TYPE = new TypeToken<List<OrderdetailsstatusEntity>>() {}.getType();
    private static final Type ORDER_STATUS_TYPE = new TypeToken<List<OrdersstatusEntity>>() {}.getType();
    private static final Type ORDER_TAX_STATUS_TYPE = new TypeToken<List<OrderstaxstatusEntity>>() {}.getType();
    private static final Type PURCHASE_ORDER_STATUS_TYPE = new TypeToken<List<PurchaseorderstatusEntity>>() {}.getType();

    private static final Type DETAIL_TYPE = new TypeToken<List<DetailEntity>>() {}.getType();
    private static final Type PURCHASE_ORDER_DETAIL_TYPE = new TypeToken<List<PurchaseorderdetailsEntity>>() {}.getType();
    private static final Type SELL_ORDER_DETAIL_TYPE = new TypeToken<List<SellorderdetailsEntity>>() {}.getType();

    private static final Type INVENTORY_TRANSACTION_TYPE = new TypeToken<List<InventorytransactionsEntity>>() {}.getType();
    private static final Type INVENTORY_TRANSACTION_TYPE_TYPE = new TypeToken<List<InventorytransactiontypesEntity>>() {}.getType();
    private static final Type INVOICE_TYPE = new TypeToken<List<InvoicesEntity>>() {}.getType();
    private static final Type PRODUCT_TYPE = new TypeToken<List<ProductsEntity>>() {}.getType();
    private static final Type STRING_TYPE = new TypeToken<List<StringsEntity>>() {}.getType();

    public void insertDummyPerson() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\person.json"));
        List<PersonEntity> personEntities =(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(personEntities);
    }

    public void insertDummyCustomers() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\customers.json"));
        List<PersonEntity> personEntities =(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(personEntities);
    }

    public void insertDummyEmployees() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\employees.json"));
        List<PersonEntity> personEntities =(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(personEntities);
    }

    public void insertDummyShippers() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\shippers.json"));
        List<PersonEntity> personEntities =(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(personEntities);
    }

    public void insertDummySuppliers() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\suppliers.json"));
        List<PersonEntity> personEntities =(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(personEntities);
    }

/*    public void insertDummyOrders() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\customers.json"));
        List<PersonEntity> persons=(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(persons);
    }*/

    public void insertDummySellOrders() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\sellOrders.json"));
        List<OrdersEntity> ordersEntities =(List<OrdersEntity>)gson.fromJson(br,SELL_ORDER_TYPE );
        System.out.println(ordersEntities);
    }

    public void insertDummyPurchaseOrders() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\purchaseorders.json"));
        List<OrdersEntity> ordersEntities =(List<OrdersEntity>)gson.fromJson(br,PURCHASE_ORDER_TYPE);
        System.out.println(ordersEntities);
    }

/*    public void insertDummyDetails() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\customers.json"));
        List<PersonEntity> persons=(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(persons);
    }*/

    public void insertDummySellOrdersDetails() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\sellOrderdetails.json"));
        List<DetailEntity> detailEntities =(List<DetailEntity>)gson.fromJson(br,SELL_ORDER_DETAIL_TYPE);
        System.out.println(detailEntities);
    }

    public void insertDummyPurchaseOrdersDetails() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\purchaseorderdetails.json"));
        List<DetailEntity> detailEntities =(List<DetailEntity>)gson.fromJson(br,PURCHASE_ORDER_DETAIL_TYPE);
        System.out.println(detailEntities);
    }

    public void insertDummyInventoryTransactions() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\inventorytransactions.json"));
        List<InventorytransactionsEntity> inventorytransactionsEntities =(List<InventorytransactionsEntity>)gson.fromJson(br,INVENTORY_TRANSACTION_TYPE);
        System.out.println(inventorytransactionsEntities);
    }

    public void insertDummyInventoryTransactionsTypes() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\inventorytransactiontypes.json"));
        List<InventorytransactiontypesEntity> inventorytransactiontypesEntities =(List<InventorytransactiontypesEntity>)gson.fromJson(br,INVENTORY_TRANSACTION_TYPE_TYPE);
        System.out.println(inventorytransactiontypesEntities);
    }

    public void insertDummyInvoices() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\invoices.json"));
        List<InvoicesEntity> invoicesEntities =(List<InvoicesEntity>)gson.fromJson(br,INVOICE_TYPE);
        System.out.println(invoicesEntities);
    }

    public void insertDummyProducts() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\products.json"));
        List<ProductsEntity> productsEntities =(List<ProductsEntity>)gson.fromJson(br,PRODUCT_TYPE);
        System.out.println(productsEntities);
    }

    public void insertDummyStrings() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\strings.json"));
        List<StringsEntity> stringsEntities =(List<StringsEntity>)gson.fromJson(br,STRING_TYPE);
        System.out.println(stringsEntities);
    }

/*    public void insertDummyStatuses() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\customers.json"));
        List<PersonEntity> persons=(List<PersonEntity>)gson.fromJson(br,PERSON_TYPE);
        System.out.println(persons);
    }*/

    public void insertDummyOrderDetailsStatus() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\orderdetailsstatus.json"));
        List<StatusEntity> statusEntities =(List<StatusEntity>)gson.fromJson(br,ORDER_DETAIL_STATUS_TYPE);
        System.out.println(statusEntities);
    }

    public void insertDummyOrdersStatus() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\ordersstatus.json"));
        List<StatusEntity> statusEntities =(List<StatusEntity>)gson.fromJson(br,ORDER_STATUS_TYPE);
        System.out.println(statusEntities);
    }

    public void insertDummyOrdersTaxStatus() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\orderstaxstatus.json"));
        List<StatusEntity> statusEntities =(List<StatusEntity>)gson.fromJson(br,ORDER_TAX_STATUS_TYPE);
        System.out.println(statusEntities);
    }

    public void insertDummyPurchaseOrderStatus() throws FileNotFoundException {
        JsonReader br = new JsonReader(new FileReader("D:\\workspaces\\HibernateAppMine\\src\\main\\resources\\sqlScripts\\data\\purchaseorderstatus.json"));
        List<StatusEntity> statusEntities =(List<StatusEntity>)gson.fromJson(br,PURCHASE_ORDER_STATUS_TYPE);
        System.out.println(statusEntities);
    }

}
