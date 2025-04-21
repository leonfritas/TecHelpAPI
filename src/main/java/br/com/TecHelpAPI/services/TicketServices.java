package br.com.TecHelpAPI.services;


import br.com.TecHelpAPI.model.Ticket;
import br.com.TecHelpAPI.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class TicketServices {

    private final TicketRepository repository;

    @Autowired
    public TicketServices(TicketRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<Ticket> getTicketDataById(Integer idTicket, Date date, String status) {
        return repository.executeTicketSelectSP(idTicket, date, status);
    }

}
