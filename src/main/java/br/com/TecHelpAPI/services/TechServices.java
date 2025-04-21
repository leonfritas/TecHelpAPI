package br.com.TecHelpAPI.services;


import br.com.TecHelpAPI.model.Tech;
import br.com.TecHelpAPI.repository.TechRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TechServices {

    private final TechRepository repository;

    @Autowired
    public TechServices(TechRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<Tech> getTechDataById(Integer idTech) {
        return repository.executeTechSelectSP(idTech);
    }

}
