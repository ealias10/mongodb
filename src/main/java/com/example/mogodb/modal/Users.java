package com.example.mogodb.modal;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class Users {
    @Id
    public UUID id;
    @Indexed(unique = true)
    public String name;
    public Roles roles;
}


//
//
//import jakarta.persistence.*;
//import lombok.*;
//import org.hibernate.annotations.GenericGenerator;
//
//
//import java.util.UUID;
//
//@Table(name = "users")
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//@Setter
//@Getter
//public class Users {
//    @Id
//    @GenericGenerator(name = "system-uuid",strategy = "uuid2")
//    @GeneratedValue(generator = "system-uuid")
//    @Column(name = "id")
//    private UUID id;
//
//    @Column(name = "name")
//    private  String name;
//
//}
//
