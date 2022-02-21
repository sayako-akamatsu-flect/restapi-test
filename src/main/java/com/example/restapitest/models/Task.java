package com.example.restapitest.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String summary;
    private Boolean done = false;
    public Task(){}
}
