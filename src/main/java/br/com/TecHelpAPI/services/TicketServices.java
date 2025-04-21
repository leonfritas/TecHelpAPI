package br.com.TecHelpAPI.services;

import br.com.TecHelpAPI.model.Ticket;
import br.com.TecHelpAPI.repository.TicketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class TicketServices {

    private static final Logger logger = LoggerFactory.getLogger(TicketServices.class);

    private final TicketRepository repository;

    @Autowired
    public TicketServices(TicketRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<Ticket> getTicketDataById(Integer idTicket, Date date, String status) {

        logger.info("Iniciando a consulta de tickets - idTicket: {}, date: {}, status: {}", idTicket, date, status);

        List<Ticket> tickets = repository.executeTicketSelectSP(idTicket, date, status);

        if (tickets.isEmpty()) {
            logger.warn("Nenhum ticket encontrado para os parâmetros fornecidos - idTicket: {}, date: {}, status: {}", idTicket, date, status);
        } else {
            logger.info("Consulta de tickets realizada com sucesso. Total de tickets encontrados: {}", tickets.size());
        }

        return tickets;
    }
}
