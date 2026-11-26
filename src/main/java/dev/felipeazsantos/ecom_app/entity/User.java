package dev.felipeazsantos.ecom_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor
@Data  
public class User {
    private Long id;
    private String firstName;
    private String lastName;
}
