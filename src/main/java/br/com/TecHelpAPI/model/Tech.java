package br.com.TecHelpAPI.model;

import jakarta.persistence.*;
import java.util.Objects;


@Entity
@NamedStoredProcedureQuery(
        name = "Tech.spTechSelect",
        procedureName = "sp_Tech_Select",
        parameters = {
                @StoredProcedureParameter(name = "idTech", mode = ParameterMode.IN, type = Integer.class)
        },
        resultClasses = Tech.class
)
public class Tech {

    @Id
    @Column(name = "idUser")
    private Long idUser;

    @Column(name = "nameUser")
    private String nameUser;

    @Column(name = "password")
    private String password;

    @Column(name = "dept")
    private String dept;

    @Column(name = "email")
    private String email;

    @Column(name = "nameSkill")
    private String nameSkill;

    public Tech(){ }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tech tech)) return false;
        return Objects.equals(getIdUser(), tech.getIdUser()) && Objects.equals(getNameUser(), tech.getNameUser()) && Objects.equals(getPassword(), tech.getPassword()) && Objects.equals(getDept(), tech.getDept()) && Objects.equals(getEmail(), tech.getEmail()) && Objects.equals(getNameSkill(), tech.getNameSkill());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdUser(), getNameUser(), getPassword(), getDept(), getEmail(), getNameSkill());
    }
}
