package entity.concrete_class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
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
        if (!(o instanceof StringsEntity)) return false;
        StringsEntity that = (StringsEntity) o;
        return getStringId() == that.getStringId() && Objects.equals(getStringData(), that.getStringData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStringId(), getStringData());
    }

    @Override
    public String toString() {
        return "StringsEntity{" +
                "stringId=" + stringId +
                ", stringData='" + stringData + '\'' +
                '}';
    }
}
