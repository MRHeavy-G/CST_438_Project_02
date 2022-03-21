package com.example.project02.Project02_Team8;

import com.example.project02.Project02_Team8.entities.Item;
import com.example.project02.Project02_Team8.entities.User;
import com.example.project02.Project02_Team8.entities.Wishlist;
import com.example.project02.Project02_Team8.repositories.ItemRepository;
import com.example.project02.Project02_Team8.repositories.UserRepository;
import com.example.project02.Project02_Team8.repositories.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api")
public class Api {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/allUsers")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping(path = "/addUser")
    public @ResponseBody
    String addUser(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        userRepository.save(user);
        return "Account successfully created";
    }

    @DeleteMapping(path = "/deleteUser")
    public @ResponseBody
    String deleteUser(@RequestParam Integer user_id) {
        User user = userRepository.findUserById(user_id);
        //User user = userRepository.findUserByUsername(username);

        userRepository.delete(user);
        return "Account successfully deleted";
    }

    @PostMapping(path = "/updateUser")
    public @ResponseBody
    String updateUser(@RequestParam Integer user_id, @RequestParam String username, @RequestParam String password, @RequestParam String email, @RequestParam Integer listId) {
        User user = userRepository.findUserById(user_id);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setListId(listId);

        userRepository.save(user);
        return "Account successfully updated";
    }

    @GetMapping(path = "findbyUsername")
    public @ResponseBody User getUser(@RequestParam String username) {
        return userRepository.findDistinctByUsernameLike(username);
    }
    @GetMapping(path = "findbyUserId")
    public @ResponseBody User getUser(@RequestParam Integer user_id) {
        return userRepository.findUserById(user_id);
    }

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping(path = "/allItems")
    public @ResponseBody
    Iterable<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @PostMapping(path = "/addItem")
    public @ResponseBody
    String addItem(@RequestParam Integer listId, @RequestParam Integer user_id, @RequestParam String name, @RequestParam Double cost, @RequestParam String description, @RequestParam Integer stock, @RequestParam String category) {
        Item item = new Item();

        item.setListId(listId);
        item.setUser_id(user_id);
        item.setName(name);
        item.setCost(cost);
        item.setDescription(description);
        item.setStock(stock);
        item.setCategory(category);

        itemRepository.save(item);
        return "Item successfully added";
    }

    @DeleteMapping(path = "/deleteItem")
    public @ResponseBody
    String deleteItem(@RequestParam Integer item_id) {
        Item item = itemRepository.findItemById(item_id);

        itemRepository.delete(item);
        return "Item successfully deleted";
    }

    @PostMapping(path = "/updateItem")
    public @ResponseBody
    String updateItem(@RequestParam Integer item_id, @RequestParam String name, @RequestParam Double cost, @RequestParam String description, @RequestParam Integer stock, @RequestParam String category) {
        Item item = itemRepository.findItemById(item_id);
        item.setName(name);
        item.setCost(cost);
        item.setDescription(description);
        item.setStock(stock);
        item.setCategory(category);

        itemRepository.save(item);
        return "Item successfully updated";
    }

    @Autowired
    private WishlistRepository wishlistRepository;

    @GetMapping(path = "/allLists")
    public @ResponseBody
    Iterable<Wishlist> getAllLists() {
        return wishlistRepository.findAll();
    }



    @GetMapping(path = "/findListsbyUserId")
    public @ResponseBody Iterable<Wishlist> getUserLists(@RequestParam Integer user_id) {
        return wishlistRepository.findWishlistsByUser_IdLike(user_id);
    }

    @PostMapping(path = "/addList")
    public @ResponseBody String addList(@RequestParam Integer user_id, @RequestParam String listName) {
        Wishlist wishlist = new Wishlist();

        wishlist.setUser_id(user_id);
        wishlist.setListName(listName);

        wishlistRepository.save(wishlist);

        return "Wishlist saved";
    }
}