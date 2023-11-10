import entity.concrete_class.InventorytransactionsEntity;
import entity.concrete_class.InvoicesEntity;
import entity.concrete_class.ProductsEntity;
import entity.joined.DetailEntity;
import entity.mapped_superclass.OrdersstatusEntity;
import entity.single_table.OrdersEntity;
import entity.single_table.PurchaseordersEntity;
import entity.single_table.SellOrdersEntity;
import entity.table_per_class.CustomersEntity;
import entity.table_per_class.EmployeesEntity;
import entity.table_per_class.PersonEntity;
import entity.table_per_class.ShippersEntity;
import utils.DummyDataUtil;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Transactional
public class main {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    static EntityManager entityManager = entityManagerFactory.createEntityManager();
    static EntityTransaction transaction = entityManager.getTransaction();
    static DummyDataUtil dummyDataUtil = new DummyDataUtil();

    public static void main(String[] args) {
        main app = new main();
        entityManager.setFlushMode(FlushModeType.COMMIT);
        try {
            transaction.begin();

//            app.getAllPerson();

//            app.getAllOrders();

//            app.getAllOrdersDetail();


//            app.insertDummyPerson();

//            app.insertDummyCustomers();

//            app.insertDummyEmployees();

//            app.insertDummyShippers();

//            app.insertDummySuppliers();


//            app.insertDummyPurchaseOrders();

//            app.insertDummySellOrders();

//            app.insertDummyOrderDetailsStatus();

//            app.insertDummyOrdersStatus();

//            app.insertDummyOrdersTaxStatus();

//            app.insertDummyPurchaseOrderStatus();


//            app.insertDummyInventoryTransactions();

//            app.insertDummyInventoryTransactionsTypes();

//            app.insertDummyInvoices();

//            app.insertDummyProducts();

//            app.insertDummyStrings();

//            app.insertPersonRecords();

            app.findAllPersons();

//            app.insertAllPersonRecords();

            transaction.commit();
        } finally {
            if(transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    private void getAllPerson(){
        TypedQuery<PersonEntity> personTypedQuery =
                entityManager.createQuery(Queries.QUERY_GET_ALL_PERSON, PersonEntity.class);
        List<PersonEntity> personEntityList = personTypedQuery.getResultList();
        personEntityList.stream().sorted((p1, p2) -> p1.getId() < p2.getId()?-1:p1.getId()>p2.getId()?1:0 ).forEach(System.out::println);
    }

    public void getAllOrders(){
        TypedQuery<OrdersEntity> ordersTypedQuery =
                entityManager.createQuery(Queries.QUERY_GET_ALL_ORDERS, OrdersEntity.class);
        List<OrdersEntity> ordersList = ordersTypedQuery.getResultList();
        ordersList.stream().sorted((o1, o2) -> o1.getId() < o2.getId()?-1:o1.getId()>o2.getId()?1:0 ).forEach(System.out::println);
    }

    public void getAllOrdersDetail(){
        TypedQuery<DetailEntity> ordersDetailTypedQuery =
                entityManager.createQuery(Queries.QUERY_GET_ALL_ORDERS_DETAIL, DetailEntity.class);
        List<DetailEntity> ordersDetailList = ordersDetailTypedQuery.getResultList();
        ordersDetailList.stream().sorted((o1, o2) -> o1.getId() < o2.getId()?-1:o1.getId()>o2.getId()?1:0 ).forEach(System.out::println);
    }

    public void insertDummyCustomers() throws FileNotFoundException {
        dummyDataUtil.insertDummyCustomers();
    }

    public void insertDummyEmployees() throws FileNotFoundException {
        dummyDataUtil.insertDummyEmployees();
    }

    public void insertDummyShippers() throws FileNotFoundException {
        dummyDataUtil.insertDummyShippers();
    }

    public void insertDummySuppliers() throws FileNotFoundException {
        dummyDataUtil.insertDummySuppliers();
    }

    public void insertDummySellOrders() throws FileNotFoundException {
        dummyDataUtil.insertDummySellOrders();
    }

    public void insertDummyPurchaseOrders() throws FileNotFoundException {
        dummyDataUtil.insertDummyPurchaseOrders();
    }

    public void insertDummyOrderDetailsStatus() throws FileNotFoundException {
        dummyDataUtil.insertDummyOrderDetailsStatus();
    }

    public void insertDummyOrdersStatus() throws FileNotFoundException {
        dummyDataUtil.insertDummyOrdersStatus();
    }

    public void insertDummyOrdersTaxStatus() throws FileNotFoundException {
        dummyDataUtil.insertDummyOrdersTaxStatus();
    }

    public void insertDummyPurchaseOrderStatus() throws FileNotFoundException {
        dummyDataUtil.insertDummyPurchaseOrderStatus();
    }

    public void insertDummyInventoryTransactions() throws FileNotFoundException {
        dummyDataUtil.insertDummyInventoryTransactions();
    }

    public void insertDummyInventoryTransactionsTypes() throws FileNotFoundException {
        dummyDataUtil.insertDummyInventoryTransactionsTypes();
    }

    public void insertDummyInvoices() throws FileNotFoundException {
        dummyDataUtil.insertDummyInvoices();
    }

    public void insertDummyProducts() throws FileNotFoundException {
        dummyDataUtil.insertDummyProducts();
    }

    public void insertDummyStrings() throws FileNotFoundException {
        dummyDataUtil.insertDummyStrings();
    }

    public void insertDummyPurchaseOrdersDetails() throws FileNotFoundException {
        dummyDataUtil.insertDummyPurchaseOrdersDetails();
    }

    public void insertDummySellOrdersDetails() throws FileNotFoundException {
        dummyDataUtil.insertDummySellOrdersDetails();
    }

    public void insertPersonRecords() throws FileNotFoundException {
        List<EmployeesEntity> personEntityList = dummyDataUtil.insertDummyEmployees();
        personEntityList.stream().forEach(personEntity -> entityManager.persist(personEntity));
        entityManager.flush();
    }

    public void insertAllPersonRecords() throws FileNotFoundException {
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

        InvoicesEntity invoicesEntity = new InvoicesEntity();
        invoicesEntity.setDType();
        invoicesEntity.setInvoiceDate(new Timestamp(localDateTime.toInstant(OffsetDateTime.now().getOffset()).toEpochMilli()));
        invoicesEntity.setAmountDue(new BigDecimal(0));
        invoicesEntity.setShipping(new BigDecimal(0));
        invoicesEntity.setTax(new BigDecimal(0));
        List<InvoicesEntity> invoicesEntities = new ArrayList<InvoicesEntity>();
        invoicesEntities.add(invoicesEntity);

        ProductsEntity productsEntity = new ProductsEntity();
        productsEntity.setDType();
        productsEntity.setProductCode("NWTD-72");
        productsEntity.setProductName("Northwind Traders Mozzarella");
        productsEntity.setStandardCost(new BigDecimal(26.1));
        productsEntity.setListPrice(new BigDecimal(34.8));
        productsEntity.setReorderLevel(10);
        productsEntity.setTargetLevel(40);
        productsEntity.setQuantityPerUnit("24 - 200 g pkgs.");
        productsEntity.setDiscontinued(new Byte("0"));
        productsEntity.setMinimumReorderQuantity(10);
        productsEntity.setCategory("Dairy Products");
        List<InventorytransactionsEntity> inventorytransactionsEntities = null;
        productsEntity.setInventorytransactionsById(inventorytransactionsEntities);
        productsEntity.setSupplierIds();
        productsEntity.setSellOrderdetailsById(annaSellOrder);
        productsEntity.setPurchaseorderdetailsById();

        InventorytransactionsEntity inventorytransactionsEntity = new InventorytransactionsEntity();
        inventorytransactionsEntity.setDType();
        inventorytransactionsEntity.setQuantity(40);
        inventorytransactionsEntity.setSellOrdersByCustomerOrderId(annaSellOrder);
        inventorytransactionsEntity.setTransactionCreatedDate(new Timestamp(localDateTime.toInstant(OffsetDateTime.now().getOffset()).toEpochMilli()));
        inventorytransactionsEntity.setTransactionModifiedDate(new Timestamp(localDateTime.toInstant(OffsetDateTime.now().getOffset()).toEpochMilli()));
        inventorytransactionsEntity.setProductsByProductId(productsEntity);
        inventorytransactionsEntity.setPurchaseorderdetailsById();
        inventorytransactionsEntity.setInventorytransactiontypesByTransactionType();
        inventorytransactionsEntities = new ArrayList<InventorytransactionsEntity>();
        inventorytransactionsEntities.add(inventorytransactionsEntity);


        annaSellOrder.setCustomersByCustomerId(anna);
        annaSellOrder.setEmployeesByEmployeeId(annaEmployee);
        annaSellOrder.setOrdersstatusByStatusId(ordersstatusEntity);
        annaSellOrder.setShippersByShipperId(shipper1);
        annaSellOrder.setInvoicesById(invoicesEntities);
        annaSellOrder.setInventorytransactionsById(inventorytransactionsEntities);
        annaSellOrder.setOrderstaxstatusByTaxStatusId();
        annaSellOrder.setSellOrderdetailsById();


        entityManager.persist(emp);
        entityManager.flush();
    }

    public void findAllPersons(){
        TypedQuery<PersonEntity> personEntityQuery = entityManager.createQuery("SELECT p FROM PersonEntity p", PersonEntity.class);
        List<PersonEntity> resultList = personEntityQuery.getResultList();
        System.out.println(resultList);
    }
}
