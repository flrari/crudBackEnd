package it.progetto.crud.model;

import javax.persistence.*;

@Entity //java annotation - contiene meta informazioni - questa classe mappa la tabella del db
@Table(name="dipendenti")
public class Dipendente { //classe java spring che rispecchia la tabella dipendenti del db

    @Id //viene visto come identificativo
    @GeneratedValue(strategy = GenerationType.IDENTITY) //come sarà generato l'id
    @Column(nullable = false, updatable = false) //non può essere nulla, non può essere modificabile
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Dipendente() {
    }

    public Dipendente(Long id, String name, String email, String jobTitle, String phone, String employeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.employeeCode = employeeCode;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }

}
