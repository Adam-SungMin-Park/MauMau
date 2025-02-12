package com.example.demo.jwt;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // For demonstration, we return a hard-coded user.
        // In production, load the user from a database or another user store.
        if ("user".equals(username)) {
            // The password here is "password" (in a real application, passwords should be encrypted!)
            return new User("user", "{noop}password", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found: " + username);
        }
    }
}
