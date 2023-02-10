public class Queries {

    public static String QUERY_GET_ORDER_BY_STATUS = "SELECT o.shipName " +
            "FROM OrdersEntity o " +
            "JOIN o.orderdetailsById od " +
            "JOIN od.orderdetailsstatusByStatusId ods " +
            "WHERE ods.statusName = :statusName";

    public static String QUERY_GET_ORDER_BY_SHIP_CITY = "SELECT o " +
            "FROM OrdersEntity o " +
            "WHERE o.shipCity= :shipCity";

    public static String QUERY_GET_ALL_PERSON = "SELECT p " +
            "FROM Person p";
}
