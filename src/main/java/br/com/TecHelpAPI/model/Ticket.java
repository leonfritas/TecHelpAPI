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
                @StoredProcedureParameter(name = "date", mode = ParameterMode.IN, type = Date.class),
                @StoredProcedureParameter(name = "status", mode = ParameterMode.IN, type = String.class),

        },
        resultClasses = Ticket.class
)
public class Ticket {

    @Id
    @Column
    private Long idTicket;

    @Column
    private String nameTicket;

    @Column
    private Date date;

    @Column
    private Long idUser;

    @Column
    private String description;

    @Column
    private Long idCategory;

    @Column
    private String status;

    @Column
    private String nameUser;

    @Column
    private String nameCategory;

    public Ticket(){ }

    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
    }

    public String getNameTicket() {
        return nameTicket;
    }

    public void setNameTicket(String nameTicket) {
        this.nameTicket = nameTicket;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
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
        if (!(o instanceof Ticket ticket)) return false;
        return Objects.equals(getIdTicket(), ticket.getIdTicket()) && Objects.equals(getNameTicket(), ticket.getNameTicket()) && Objects.equals(getDate(), ticket.getDate()) && Objects.equals(getIdUser(), ticket.getIdUser()) && Objects.equals(getDescription(), ticket.getDescription()) && Objects.equals(getIdCategory(), ticket.getIdCategory()) && Objects.equals(getStatus(), ticket.getStatus()) && Objects.equals(getNameUser(), ticket.getNameUser()) && Objects.equals(getNameCategory(), ticket.getNameCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdTicket(), getNameTicket(), getDate(), getIdUser(), getDescription(), getIdCategory(), getStatus(), getNameUser(), getNameCategory());
    }
}
