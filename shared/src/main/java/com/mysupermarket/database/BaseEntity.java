package com.mysupermarket.database;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue
    @Column(columnDefinition="uuid", updatable=false, nullable=false)
    public UUID oid ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;
        BaseEntity that = (BaseEntity) o;
        return oid.equals(that.oid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oid);
    }

    @Override
    public String toString() {
        return "BaseEntity {" +
                "id = " + oid +
                "}";
    }
}
