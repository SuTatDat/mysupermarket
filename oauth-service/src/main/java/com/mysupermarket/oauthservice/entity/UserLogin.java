package com.mysupermarket.oauthservice.entity;

import java.util.Objects;

import com.mysupermarket.database.BaseEntityAudit;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity (name = "user_login")
@ToString
public class UserLogin extends BaseEntityAudit {
    private String username;
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntityAudit)) return false;
        if (!super.equals(o)) return false;
        UserLogin that = (UserLogin) o;
        return username.equals(that.username) &&
                password.equals(that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), username, password);
    }

}
