package com.example.users;

import com.example.users.entities.Role;
import com.example.users.entities.User;
import com.example.users.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class UsersApplication {

    public static void main(String[] args) {

        SpringApplication. run(UsersApplication.class, args);
    }
  @Bean
    CommandLineRunner start(UserService userService){
        return args -> {
            User u=new User();
            u.setUserName("user1");
            u.setPassword("123456");
            userService.addNewUser(u);

            User u1=new User();
            u.setUserName("admin");
            u.setPassword("123456");
            userService.addNewUser(u1);

            Stream.of("STUDENT" ,"USER","ADMIN").forEach(r->{
                Role role1=new Role();
                role1.setRoleName(r);
                userService.addNewRole(role1);
            });

             userService.addRoleToUser("user1","STUDENT");
             userService.addRoleToUser("user1","USER");
            userService.addRoleToUser("admin","USER");
             userService.addRoleToUser("admin","ADMIN");



        };
  }

}
