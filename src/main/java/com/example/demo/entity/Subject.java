package com.example.demo.entity;
//
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Data
@Entity
@Table
@EnableAutoConfiguration
public class Subject {
    @Id
    @GeneratedValue
    private Long id;

    public Subject(Long id) {
        this.id = id;
    }

    public Subject() {
    }
}