package com.mysupermarket.oauthservice.entity;

import com.mysupermarket.database.BaseEntityAudit;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity (name = "user_login")
public class UserLogin extends BaseEntityAudit {
    private String username;
    private String password;
}
