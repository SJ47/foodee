package com.ialcoholic.foodees.foodee_service.models.people;

import javax.persistence.*;

@Entity
@Table(name = "admins")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
//    probably shouldn't be saved at our end? ^^"

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
