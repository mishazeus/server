package com.example.server;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {

    private @Id @GeneratedValue
    Integer id;

    private String login;
    private String password;
    private String fio;
    private String datetimechange;
    private Integer idchangedperson;

    public Admin(){
    }

    public Admin(String login, String password, String fio, String dateTimeChange, Integer idchangedpersone){

        this.login = login;
        this.password = password;
        this.fio = fio;
        this.datetimechange = dateTimeChange;
        this.idchangedperson = idchangedpersone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDatetimechange() {
        return datetimechange;
    }

    public void setDatetimechange(String datetimechange) {
        this.datetimechange = datetimechange;
    }

    public Integer getIdchangedperson() {
        return idchangedperson;
    }

    public void setIdchangedperson(Integer idchangedperson) {
        this.idchangedperson = idchangedperson;
    }
}
