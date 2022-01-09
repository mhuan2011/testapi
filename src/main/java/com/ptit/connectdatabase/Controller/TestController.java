package com.ptit.connectdatabase.Controller;

import com.ptit.connectdatabase.Config.CategoryRepository;
import com.ptit.connectdatabase.Enity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping(value="/hello")
    public ResponseEntity<?> helloWorld(){

        List<Category> categoryList = (List<Category>) categoryRepository.findAll();
        for(Category c: categoryList){
            System.out.println(c.getId() +" "+c.getName());
        }
        return ResponseEntity.ok(categoryList);
    }
}
