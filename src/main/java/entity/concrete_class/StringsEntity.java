package entity.concrete_class;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "strings", schema = "northwind")
public class StringsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int stringId;
    private String stringData;

    public int getStringId() {
        return stringId;
    }

    public void setStringId(int stringId) {
        this.stringId = stringId;
    }

    public String getStringData() {
        return stringData;
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringsEntity that = (StringsEntity) o;
        return stringId == that.stringId && Objects.equals(stringData, that.stringData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stringId, stringData);
    }

    @Override
    public String toString() {
        return "StringsEntity{" +
                "stringId=" + stringId +
                ", stringData='" + stringData + '\'' +
                '}';
    }
}
