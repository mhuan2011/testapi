package com.ptit.connectdatabase.Config;

import com.ptit.connectdatabase.Enity.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, String> {

}
