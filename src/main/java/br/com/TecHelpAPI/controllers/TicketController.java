package br.com.TecHelpAPI.controllers;

import br.com.TecHelpAPI.data.dto.TicketDTO;
import br.com.TecHelpAPI.model.Ticket;
import br.com.TecHelpAPI.services.TicketServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private final TicketServices service;

    @Autowired
    public TicketController(TicketServices service) {
        this.service = service;
    }

    @PostMapping
    public List<Ticket> getTicketData(@RequestBody TicketDTO request) {
        return service.getTicketDataById(request.getIdTicket(), request.getData(), request.getStatus());
    }
}
