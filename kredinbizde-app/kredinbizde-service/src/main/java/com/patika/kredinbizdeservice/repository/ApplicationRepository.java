package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRepository {

    private List<Application> applicationList = new ArrayList<>();

    public Application save(Application application) {
        applicationList.add(application);
        return application;
    }

    public List<Application> findByUser(User user) {
        List<Application> userApplications = new ArrayList<>();
        for (Application application : applicationList) {
            if (application.getUser().equals(user)) {
                userApplications.add(application);
            }
        }
        return userApplications;
    }
}
