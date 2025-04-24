package br.com.TecHelpAPI.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@NamedStoredProcedureQuery(
        name = "Ticket.spTicketSelect",
        procedureName = "sp_Ticket_Select",
        parameters = {
                @StoredProcedureParameter(name = "idTicket", mode = ParameterMode.IN, type = Integer.class),
                @StoredProcedureParameter(name = "dateTicket", mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(name = "status", mode = ParameterMode.IN, type = String.class),

        },
        resultClasses = Ticket.class
)
public class Ticket {

    @Id
    @Column
    private Integer idTicket;

    @Column
    private String nameTicket;

    @Column
    private Date dateTicket;

    @Column
    private Integer idUser;

    @Column
    private String description;

    @Column
    private Integer idCategory;

    @Column
    private String status;

    @Column
    private String nameUser;

    @Column
    private String nameCategory;

    public Ticket(){ }

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public String getNameTicket() {
        return nameTicket;
    }

    public void setNameTicket(String nameTicket) {
        this.nameTicket = nameTicket;
    }

    public Date getDateTicket() {
        return dateTicket;
    }

    public void setDateTicket(Date dateTicket) {
        this.dateTicket = dateTicket;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(getIdTicket(), ticket.getIdTicket()) && Objects.equals(getNameTicket(), ticket.getNameTicket()) && Objects.equals(getDateTicket(), ticket.getDateTicket()) && Objects.equals(getIdUser(), ticket.getIdUser()) && Objects.equals(getDescription(), ticket.getDescription()) && Objects.equals(getIdCategory(), ticket.getIdCategory()) && Objects.equals(getStatus(), ticket.getStatus()) && Objects.equals(getNameUser(), ticket.getNameUser()) && Objects.equals(getNameCategory(), ticket.getNameCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdTicket(), getNameTicket(), getDateTicket(), getIdUser(), getDescription(), getIdCategory(), getStatus(), getNameUser(), getNameCategory());
    }
}
