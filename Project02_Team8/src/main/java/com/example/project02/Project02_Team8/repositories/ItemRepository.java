package com.example.project02.Project02_Team8.repositories;

import com.example.project02.Project02_Team8.entities.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
