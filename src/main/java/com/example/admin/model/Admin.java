package com.example.admin.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
public class Admin {
    @Id
    int id ;
    String name;
    String city;

}
