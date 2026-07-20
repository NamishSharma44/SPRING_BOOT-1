package com.namish.demo.StudentServer.DTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class createStudentRequestDTO {
    private String name;
    private int age;
    private String department;
}
