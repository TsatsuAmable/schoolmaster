package com.locode.apps.schoolmaster.auth.user;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService, UserStatusManager {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }


//    @Transactional(rollbackFor = Exception.class)
//    public String saveDto(UserDto userDto) {
//
//        //TODO Connect Bcrypt to this later
//        userDto.setPassword(userDto.getPassword());
//        return userRepository.save(new User(userDto));
//    }
}
