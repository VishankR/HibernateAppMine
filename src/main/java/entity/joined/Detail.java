package entity.joined;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The joined table approach maps each class of the inheritance hierarchy to its own database table. This sounds similar to the
 * table per class strategy. But this time, also the abstract superclass gets mapped to a database table.
 * This table contains columns for all shared entity attributes. The tables of the subclasses are much smaller than in the
 * table per class strategy. They hold only the columns specific for the mapped entity class and a primary key with the same value
 * as the record in the table of the superclass.
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Detail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private Integer orderId;
    private BigDecimal quantity;
    private BigDecimal unitPrice;
    private Integer inventoryId;
}
