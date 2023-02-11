import entity.joined.DetailEntity;
import entity.single_table.OrdersEntity;
import entity.table_per_class.Person;

import javax.persistence.*;
import java.util.List;

public class main {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();

    public static void main(String[] args) {
        main app = new main();
        try {
            app.transaction.begin();

            //app.getAllPerson();

            //app.getAllOrders();

            //app.getAllOrdersDetail();

            app.transaction.commit();
        } finally {
            if(app.transaction.isActive()) {
                app.transaction.rollback();
            }
            app.entityManager.close();
            app.entityManagerFactory.close();
        }
    }

    private void getAllPerson(){
        TypedQuery<Person> personTypedQuery =
                entityManager.createQuery(Queries.QUERY_GET_ALL_PERSON, Person.class);
        List<Person> personList = personTypedQuery.getResultList();
        personList.stream().sorted((p1, p2) -> p1.getId() < p2.getId()?-1:p1.getId()>p2.getId()?1:0 ).forEach(System.out::println);
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
}
