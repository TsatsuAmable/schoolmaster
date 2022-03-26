package com.locode.apps.schoolmaster.auth.user;

import com.locode.apps.schoolmaster.auth.Role;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDto {
    String Id;
    String username;
    String password;
    String firstName;
    String lastName;
    String email;
    List<Role> roles;
}
