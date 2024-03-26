package com.example.users.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="")
@Data @NoArgsConstructor @AllArgsConstructor
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @Column(length = 20,unique = true)
    private String roleName;
    @ManyToMany(fetch = FetchType.EAGER)
   // @JoinTable(name = "USERS_ROLES")
    private List<User> users=new ArrayList<>() ;
}
