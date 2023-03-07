package com.devrezaur.main.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Table(name = "results")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;

    private Integer totalCorrect = 0;

    public Result() {

    }

    public Result(Integer id, String username, int totalCorrect) {
        this.id = id;
        this.username = username;
        this.totalCorrect = totalCorrect;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getTotalCorrect() {
        return totalCorrect;
    }

    public void setTotalCorrect(Integer totalCorrect) {
        this.totalCorrect = totalCorrect;
    }
}
