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

    public Date getData() {
        return data;
    }

    public String getStatus() {
        return status;
    }

}
