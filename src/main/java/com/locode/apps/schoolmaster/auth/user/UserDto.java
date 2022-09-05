/**
                Author: Tsatsu Amable
                (C)2022
                */
package com.locode.apps.schoolmaster.auth.user;

import com.locode.apps.schoolmaster.auth.Role;
import java.util.List;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

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
