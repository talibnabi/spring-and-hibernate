package com.company.core.autowireBased;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class UserService {
    //    @Autowired(required = false)
    private UserRepo userRepo;

//    @Autowired
//    public UserService(UserRepo userRepo) {
//        this.userRepo = userRepo;
//    }

    @Autowired
    public void setUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void save() {
        if (Objects.isNull(userRepo)) {
            System.out.println("Repo is not provided.");
            return;
        }
        userRepo.save();
    }
}
