package com.example.msproject.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidat implements Serializable {
    private static final long serialVersionUID = 6;
    @Id
    @GeneratedValue
    private int id;
    private String nom,prenom,email;


    public Candidat(String nom, String ch, String mail) {
        this.nom=nom;
        this.prenom=ch;
        this.email=mail;
    }
}
