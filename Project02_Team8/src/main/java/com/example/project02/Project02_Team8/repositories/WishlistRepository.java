package com.example.project02.Project02_Team8.repositories;

import com.example.project02.Project02_Team8.entities.Wishlist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface WishlistRepository extends CrudRepository<Wishlist, Integer> {
    @Query(value = "select * from Wishlist join User where Wishlist.user_id = User.user_id",
            countQuery = "select count(*) from Wishlist",
            nativeQuery = true)
    Iterable<Wishlist> findWishlistsByUser_IdLike(Integer user_id);

    @Query(value = "select * from Wishlist join User where Wishlist.user_id = User.user_id and Wishlist.listId = User.listId",
            countQuery = "select count(*) from Wishlist",
            nativeQuery = true)
    Iterable<Wishlist> findWishlistsByUser_IdAndAndListIdLike(Integer user_id, Integer listId);

}
