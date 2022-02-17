package com.example.demo.kala;

import javax.persistence.*;

@Entity
@Table(name = "KALA")
public class Kala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NameKala")
    private String nameKala;
    @Column(name = "TadadKala")
    private Integer tadadKala;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameKala() {
        return nameKala;
    }

    public void setNameKala(String nameKala) {
        this.nameKala = nameKala;
    }

    public Integer getTadadKala() {
        return tadadKala;
    }

    public void setTadadKala(Integer tadadKala) {
        this.tadadKala = tadadKala;
    }
}
