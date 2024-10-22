package com.ltc.laresspringlearning.controller;


import com.ltc.laresspringlearning.entities.Order;
import com.ltc.laresspringlearning.entities.Role;
import com.ltc.laresspringlearning.entities.User;
import com.ltc.laresspringlearning.entities.UserProfile;
import com.ltc.laresspringlearning.repository.OrderRepository;
import com.ltc.laresspringlearning.repository.RoleRepository;
import com.ltc.laresspringlearning.repository.UserProfileRepository;
import com.ltc.laresspringlearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private RoleRepository roleRepository;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(updatedUser.getName());
        user.setOrders(updatedUser.getOrders());
        user.setUserProfile(updatedUser.getUserProfile());
        user.setRoles(updatedUser.getRoles());
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

    @PostMapping("/{userId}/orders")
    public User addOrderToUser(@PathVariable Long userId, @RequestBody Order order) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        order.setUser(user);
        orderRepository.save(order);
        return user;
    }

    @PostMapping("/{userId}/profile")
    public User assignProfileToUser(@PathVariable Long userId, @RequestBody UserProfile userProfile) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setUserProfile(userProfileRepository.save(userProfile));
        return userRepository.save(user);
    }

    @PostMapping("/{userId}/roles")
    public User assignRolesToUser(@PathVariable Long userId, @RequestBody Set<Role> roles) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        for (Role role : roles) {
            roleRepository.save(role);
        }
        user.setRoles(roles);
        return userRepository.save(user);
    }
}
