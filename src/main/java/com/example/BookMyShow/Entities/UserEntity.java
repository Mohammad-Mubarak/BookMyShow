package com.example.BookMyShow.Entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@Builder  // it build fast object and it always require all args constructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;


    @Column(unique = true,nullable = false)
    private String email;

    @NonNull
    @Column(unique = true)
    private String mobNo;

    private String address;

    @OneToMany(mappedBy = "userEntity",cascade = CascadeType.ALL)
    private List<TicketEntity> bookedTickets = new ArrayList<>();

}
