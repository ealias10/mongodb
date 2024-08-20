package com.example.mogodb.request;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String name;
    private String role;
}
