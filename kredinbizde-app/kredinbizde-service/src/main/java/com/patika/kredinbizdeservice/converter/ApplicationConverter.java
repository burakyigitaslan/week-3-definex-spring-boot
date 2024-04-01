package com.patika.kredinbizdeservice.converter;

import com.patika.kredinbizdeservice.dto.request.ApplicationRequest;
import com.patika.kredinbizdeservice.enums.ApplicationStatus;
import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ApplicationConverter {

    public Application toApplication(ApplicationRequest request, User user) {
        Application application = new Application();
        application.setUser(user);
        application.setLocalDateTime(LocalDateTime.now());
        application.setApplicationStatus(ApplicationStatus.INITIAL);

        return application;
    }
}
