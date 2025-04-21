package br.com.TecHelpAPI.services;

import br.com.TecHelpAPI.exception.ResourceNotFoundException;
import br.com.TecHelpAPI.model.Category;
import br.com.TecHelpAPI.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class CategoryServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(CategoryServices.class.getName());

    @Autowired
    CategoryRepository repository;

    public List<Category> findAll(){
        logger.info("Finding all categories!");

        return repository.findAll();
    }

    public Category findById(Long id){
        logger.info("Finding one category!");

        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
    }

    public Category create(Category category){
        logger.info("Create one user!");

        return repository.save(category);
    }

    public Category update(Category category){
        logger.info("Updating one category!");
        Category entity = repository.findById(category.getIdCategory())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));

        entity.setNameCategory(category.getNameCategory());

        return repository.save(entity);
    }

    public void delete(Long id){
        logger.info("Delete one category!");

        Category entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
        repository.delete(entity);
    }

}
