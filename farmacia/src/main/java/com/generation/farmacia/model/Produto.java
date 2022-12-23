package com.generation.farmacia.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cglib.core.Local;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    @Size(min = 5, max = 100, message = "Nome pode conter de 5 a 10 caracteres.")
    private String name;

    @Size(min = 5, max = 1000, message = "Descrição pode conter de 5 a 10 caracteres")
    private String description;

    @UpdateTimestamp
    private LocalDateTime vDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getvDateTime() {
        return vDateTime;
    }

    public void setvDateTime(LocalDateTime vDateTime) {
        this.vDateTime = vDateTime;
    }

    
    
}
