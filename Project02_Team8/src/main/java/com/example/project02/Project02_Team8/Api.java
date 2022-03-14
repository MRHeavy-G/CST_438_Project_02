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
}
