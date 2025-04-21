package br.com.TecHelpAPI.dto;

import java.util.Date;

public class TicketDTO {

    private Integer idTicket;
    private Date data;
    private String status;

    public TicketDTO() {}

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
