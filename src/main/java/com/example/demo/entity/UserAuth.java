package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author 邱道长
 * 2020/12/30
 */
@Setter
@Getter
@Entity
@Table(name = "user_auth")
public class UserAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private Boolean accountNonExpire;
    private Boolean nonLock;
    private Boolean credentialNonExpire;
    private Boolean enabled;

}
