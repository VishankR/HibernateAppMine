import entity.joined.DetailEntity;
import entity.single_table.OrdersEntity;
import entity.table_per_class.PersonEntity;
import utils.DummyDataUtil;

import javax.persistence.*;
import java.io.FileNotFoundException;
import java.util.List;

public class main {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    DummyDataUtil dummyDataUtil = new DummyDataUtil();

    public static void main(String[] args) {
        main app = new main();
        try {
            app.transaction.begin();

//            app.getAllPerson();

//            app.getAllOrders();

//            app.getAllOrdersDetail();


//            app.insertDummyPerson();

//            app.insertDummyCustomers();

//            app.insertDummyEmployees();

//            app.insertDummyShippers();

//            app.insertDummySuppliers();


//            app.insertDummyPurchaseOrders();

            app.insertDummySellOrders();


//            app.insertDummyOrderDetailsStatus();

//            app.insertDummyOrdersStatus();

//            app.insertDummyOrdersTaxStatus();

//            app.insertDummyPurchaseOrderStatus();


//            app.insertDummyInventoryTransactions();

//            app.insertDummyInventoryTransactionsTypes();

//            app.insertDummyInvoices();

//            app.insertDummyProducts();

//            app.insertDummyStrings();

            app.transaction.commit();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if(app.transaction.isActive()) {
                app.transaction.rollback();
            }
            app.entityManager.close();
            app.entityManagerFactory.close();
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

    public void insertDummyPerson() throws FileNotFoundException {
        dummyDataUtil.insertDummyPerson();
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

}
