package com.example.project02.Project02_Team8.repositories;

import com.example.project02.Project02_Team8.entities.Wishlist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface WishlistRepository extends CrudRepository<Wishlist, Integer> {
    @Query(value = "select * from User u where u.user_id like %:user_id%",
            countQuery = "select count(*) from User",
            nativeQuery = true)
    Wishlist findWishlistsByUser_idLike(@Param("user_id")Integer user_id);
}
