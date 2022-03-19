package com.example.project02.Project02_Team8.repositories;

import com.example.project02.Project02_Team8.entities.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ItemRepository extends CrudRepository<Item, Integer> {
    @Query(value = "select * from Item i where i.name = %:name%",
            countQuery = "select count(*) from Item",
            nativeQuery = true)
    Item findItemByName(
            @Param("name") String name
    );

    @Query(value = "select * from Item i where i.item_id like %:item_id%",
            countQuery = "select count(*) from Item",
            nativeQuery = true)
    Item findItemById(
            @Param("item_id") Integer item_id
    );

    Iterable<Item> findItemsByListIdLike(Integer listId);
}
