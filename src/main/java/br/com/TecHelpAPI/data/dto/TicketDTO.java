package br.com.TecHelpAPI.data.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@JsonPropertyOrder({"idTicket", "nameTicket", "dateTicket", "idUser", "description",
                    "idCategory", "status", "nameUser", "nameCategory"})
public class TicketDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer idTicket;
    private String nameTicket;
    private Date dateTicket;
    private Integer idUser;
    private String description;
    private Integer idCategory;
    private String status;
    private String nameUser;
    private String nameCategory;

    public TicketDTO() {}

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
        TicketDTO ticketDTO = (TicketDTO) o;
        return Objects.equals(getIdTicket(), ticketDTO.getIdTicket()) && Objects.equals(getNameTicket(), ticketDTO.getNameTicket()) && Objects.equals(getDateTicket(), ticketDTO.getDateTicket()) && Objects.equals(getIdUser(), ticketDTO.getIdUser()) && Objects.equals(getDescription(), ticketDTO.getDescription()) && Objects.equals(getIdCategory(), ticketDTO.getIdCategory()) && Objects.equals(getStatus(), ticketDTO.getStatus()) && Objects.equals(getNameUser(), ticketDTO.getNameUser()) && Objects.equals(getNameCategory(), ticketDTO.getNameCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdTicket(), getNameTicket(), getDateTicket(), getIdUser(), getDescription(), getIdCategory(), getStatus(), getNameUser(), getNameCategory());
    }
}
