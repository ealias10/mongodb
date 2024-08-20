package com.example.mogodb.modal;

import lombok.*;
import org.springframework.aot.generate.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "roles")
public class Roles {

    @Id
    public UUID id;
    @Indexed(unique = true)
    public String role;


}
