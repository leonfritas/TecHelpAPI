package br.com.TecHelpAPI.services;

import br.com.TecHelpAPI.data.dto.TicketDTO;
import br.com.TecHelpAPI.model.Ticket;
import br.com.TecHelpAPI.repository.TicketRepository;
import static br.com.TecHelpAPI.mapper.ObjectMapper.parseListObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
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
    public List<TicketDTO> getTicketData(Integer idTicket, LocalDate dateTicket, String status) {

        logger.info("Iniciando a consulta de tickets - idTicket: {}, dateTicket: {}, status: {}", idTicket, dateTicket, status);

        List<Ticket> tickets = repository.executeTicketSelectSP(idTicket, dateTicket, status);

        if (tickets.isEmpty()) {
            logger.warn("Nenhum ticket encontrado para os parâmetros fornecidos - idTicket: {}, dateTicket: {}, status: {}", idTicket, dateTicket, status);
        } else {
            logger.info("Consulta de tickets realizada com sucesso. Total de tickets encontrados: {}", tickets.size());
        }

        return parseListObjects(tickets, TicketDTO.class);
    }
}
