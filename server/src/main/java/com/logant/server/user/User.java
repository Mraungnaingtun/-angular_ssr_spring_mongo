package com.logant.server.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import java.util.List;


@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String phoneNumber;
    private Profile profile;
    private List<String> followers;
    private List<String> following;
    private String role;
    private Security security;


    @Data
    public static class Profile {
        private String name;
        private String bio;
        private String profileImage;
        private String dateOfBirth;
        private String cityTownship;
    }


    @Data
    public static class Security {
        private String passwordHash;
        private boolean twoFactorEnabled;
        private String lastLogin;
    }
}
