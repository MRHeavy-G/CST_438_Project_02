package com.example.project02.Project02_Team8;

import com.example.project02.Project02_Team8.entities.Item;
import com.example.project02.Project02_Team8.entities.User;
import com.example.project02.Project02_Team8.repositories.ItemRepository;
import com.example.project02.Project02_Team8.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api")
public class Api {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/allUsers")
    public @ResponseBody Iterable <User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping(path = "/addUser")
    public @ResponseBody String addUser (@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        userRepository.save(user);
        return "Account successfully created";
    }

    @DeleteMapping(path = "/deleteUser")
    public @ResponseBody String deleteUser(@RequestParam Integer id) {
        User user = userRepository.findUserById(id);

        userRepository.delete(user);
        return "Account successfully deleted";
    }

    @PostMapping(path = "/updateUser")
    public @ResponseBody String updateUser (@RequestParam Integer id, @RequestParam String username, @RequestParam String password, @RequestParam String email) {
        User user = userRepository.findUserById(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        userRepository.save(user);
        return "Account successfully updated";
    }

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping(path = "/allItems")
    public @ResponseBody Iterable <Item> getAllItems() {
        return itemRepository.findAll();
    }

    @PostMapping(path = "/addItem")
    public @ResponseBody String addItem (@RequestParam String name, @RequestParam Double cost, @RequestParam String description, @RequestParam Integer stock, @RequestParam String category) {
        Item item = new Item();
        item.setName(name);
        item.setCost(cost);
        item.setDescription(description);
        item.setStock(stock);
        item.setCategory(category);

        itemRepository.save(item);
        return "Item successfully created";
    }
    @DeleteMapping(path = "/deleteItem")
    public @ResponseBody String deleteItem (@RequestParam Integer item_id) {
        Item item = itemRepository.findItemById(item_id);

        itemRepository.delete(item);
        return "Item successfully deleted";
    }

    @PostMapping(path = "/updateItem")
    public @ResponseBody String updateItem (@RequestParam Integer item_id,@RequestParam String name, @RequestParam Double cost, @RequestParam String description, @RequestParam Integer stock, @RequestParam String category) {
        Item item = itemRepository.findItemById(item_id);
        item.setName(name);
        item.setCost(cost);
        item.setDescription(description);
        item.setStock(stock);
        item.setCategory(category);

        itemRepository.save(item);
        return "Item successfully updated";
    }
}
