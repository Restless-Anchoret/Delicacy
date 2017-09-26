package com.delicacycomics.delicacy.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Дмитрий on 11.08.2017.
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;
    private String login;
    @Column(name = "password_hash")
    private String passwordHash;
    private String name;
    private String surname;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "ip_address")
    private String ipAddress;
    @Column(name = "last_visited_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private String role;
    @Column(name = "registration_date")
    private Date registrationDate;
    private String email;
    private String link;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User(String login, String passwordHash, String name, String surname, String phoneNumber) {
        this.login = login;
        this.passwordHash = passwordHash;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
