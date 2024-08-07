package edu.marcio.parking_control.Configuration.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import edu.marcio.parking_control.model.UserModel;
import edu.marcio.parking_control.repository.UserRepository;

public class UserDetailServiceImplementation implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = new UserModel();
        userModel = userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("there is not a user called "+username));
        return userModel;
    }

}
