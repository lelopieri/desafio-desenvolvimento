package br.com.cresol.desafio.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cliente", schema = "public", catalog = "desafio")
public class ClienteEntity {
    private int id;
    private Long cpf;
    private String nome;
    private String email;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cpf")
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Basic
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity that = (ClienteEntity) o;
        return id == that.id &&
                Objects.equals(cpf, that.cpf) &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf, nome, email);
    }
}
