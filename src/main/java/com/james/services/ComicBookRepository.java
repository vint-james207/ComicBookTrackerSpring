package com.james.services;

import com.james.entities.ComicBook;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jamesyburr on 7/10/16.
 */
public interface ComicBookRepository extends CrudRepository<ComicBook, Integer> {
}
