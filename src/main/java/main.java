import entity.single_table.OrdersEntity;
import entity.table_per_class.Person;

import javax.persistence.*;
import java.util.List;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            List<OrdersEntity> orderDetails;

            transaction.begin();

            /*TypedQuery<String> shipNameTypedQuery =
                    entityManager.createQuery(Queries.QUERY_GET_ORDER_BY_STATUS, String.class);
            shipNameTypedQuery.setParameter("statusName", Constants.ORDER_DETAILS_STATUS.No_Stock.toString());
            List<String> shipNameList = shipNameTypedQuery.getResultList();
            shipNameList.stream().forEach(System.out::println);*/

            /*TypedQuery<OrdersEntity> ordersEntityTypedQuery =
                    entityManager.createQuery(Queries.QUERY_GET_ORDER_BY_SHIP_CITY, OrdersEntity.class);
            ordersEntityTypedQuery.setParameter("shipCity", Constants.CITIES.Las_Vegas.toString());
            List<OrdersEntity> ordersEntities = ordersEntityTypedQuery.getResultList();
            ordersEntities.stream().forEach(System.out::println);*/

            TypedQuery<Person> personTypedQuery =
                    entityManager.createQuery(Queries.QUERY_GET_ALL_PERSON, Person.class);
            List<Person> personList = personTypedQuery.getResultList();
            personList.stream().sorted((p1, p2) -> p1.getId() < p2.getId()?-1:p1.getId()>p2.getId()?1:0 ).forEach(System.out::println);
            transaction.commit();
        } finally {
            if(transaction.isActive()) {
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
