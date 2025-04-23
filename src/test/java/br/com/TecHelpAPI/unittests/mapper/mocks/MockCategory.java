package br.com.TecHelpAPI.unittests.mapper.mocks;

import br.com.TecHelpAPI.data.dto.CategoryDTO;
import br.com.TecHelpAPI.model.Category;

import java.util.ArrayList;
import java.util.List;

public class MockCategory {


    public Category mockEntity() {
        return mockEntity(0);
    }

    public CategoryDTO mockDTO() {
        return mockDTO(0);
    }

    public List<Category> mockEntityList() {
        List<Category> persons = new ArrayList<Category>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockEntity(i));
        }
        return persons;
    }

    public List<CategoryDTO> mockDTOList() {
        List<CategoryDTO> persons = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockDTO(i));
        }
        return persons;
    }

    public Category mockEntity(Integer number) {
        Category Category = new Category();
        Category.setIdCategory(number.longValue());
        Category.setNameCategory("Category Name Test" + number);
        return Category;
    }

    public CategoryDTO mockDTO(Integer number) {
        CategoryDTO Category = new CategoryDTO();
        Category.setIdCategory(number.longValue());
        Category.setNameCategory("Category Name Test" + number);
        return Category;
    }

}