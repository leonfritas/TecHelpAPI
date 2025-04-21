package br.com.TecHelpAPI.services;

import br.com.TecHelpAPI.exception.ResourceNotFoundException;
import br.com.TecHelpAPI.model.Skill;
import br.com.TecHelpAPI.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class SkillServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(SkillServices.class.getName());

    @Autowired
    SkillRepository repository;

    public List<Skill> findAll(){
        logger.info("Finding all skills!");

        return repository.findAll();
    }

    public Skill findById(Long id){
        logger.info("Finding one skill!");

        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
    }

    public Skill create(Skill skill){
        logger.info("Create one user!");

        return repository.save(skill);
    }

    public Skill update(Skill skill){
        logger.info("Updating one skill!");
        Skill entity = repository.findById(skill.getIdSkill())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));

        entity.setNameSkill(skill.getNameSkill());

        return repository.save(entity);
    }

    public void delete(Long id){
        logger.info("Delete one skill!");

        Skill entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
        repository.delete(entity);
    }

}
