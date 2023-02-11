select
    detailenti0_.id as id1_1_,
    detailenti0_.inventoryId as inventor2_1_,
    detailenti0_.orderId as orderid3_1_,
    detailenti0_.quantity as quantity4_1_,
    detailenti0_.unitPrice as unitpric5_1_,
    detailenti0_1_.dateReceived as daterece1_12_,
    detailenti0_1_.inventoryId as inventor4_12_,
    detailenti0_1_.postedToInventory as postedto2_12_,
    detailenti0_1_.productId as producti5_12_,
    detailenti0_1_.purchaseOrderId as purchase6_12_,
    detailenti0_2_.dateAllocated as dateallo1_14_,
    detailenti0_2_.discount as discount2_14_,
    detailenti0_2_.statusId as statusid5_14_,
    detailenti0_2_.productId as producti6_14_,
    detailenti0_2_.purchaseOrderId as purchase3_14_,
    detailenti0_2_.orderId as orderid7_14_,
    case
        when detailenti0_1_.id is not null then 1
        when detailenti0_2_.id is not null then 2
        when detailenti0_.id is not null then 0
        end as clazz_
from
    DetailEntity detailenti0_
        left outer join
    PurchaseorderdetailsEntity detailenti0_1_
    on detailenti0_.id=detailenti0_1_.id
        left outer join
    SellorderdetailsEntity detailenti0_2_
    on detailenti0_.id=detailenti0_2_.id