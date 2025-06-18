package com.example.demo.persistence;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Persona {
    @Id
    private Long id;
    private String nome;
    private String cognome;

    public Long getId() {
      return this.id;
    }
    public void setId(Long value) {
      this.id = value;
    }

    public String getNome() {
      return this.nome;
    }
    public void setNome(String value) {
      this.nome = value;
    }

    public String getCognome() {
      return this.cognome;
    }
    public void setCognome(String value) {
      this.cognome = value;
    }
}
