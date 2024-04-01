package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.client.AkbankServiceClient;
import com.patika.kredinbizdeservice.client.GarantiServiceClient;
import com.patika.kredinbizdeservice.client.dto.request.AkbankApplicationRequest;
import com.patika.kredinbizdeservice.client.dto.request.GarantiApplicationRequest;
import com.patika.kredinbizdeservice.client.dto.response.AkbankApplicationResponse;
import com.patika.kredinbizdeservice.client.dto.response.GarantiApplicationResponse;
import com.patika.kredinbizdeservice.converter.ApplicationConverter;
import com.patika.kredinbizdeservice.dto.request.ApplicationRequest;
import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;
import com.patika.kredinbizdeservice.repository.ApplicationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApplicationService {

    private final ApplicationRepository applicationRepository = new ApplicationRepository();
    private final ApplicationConverter applicationConverter;
    private final UserService userService;
    private final AkbankServiceClient akbankServiceClient;
    private final GarantiServiceClient garantiServiceClient;

    public Application createApplicationForAkbank(ApplicationRequest request) {

        User user = userService.getByEmail(request.getEmail());
        log.info("user bulundu");

        Application application = applicationConverter.toApplication(request, user);

        Application savedApplication = applicationRepository.save(application);

        AkbankApplicationResponse akbankApplicationResponse = akbankServiceClient.createApplication(prepareAkbankApplicationRequest(user));

        return savedApplication;
    }

    public Application createApplicationForGaranti(ApplicationRequest request) {

        User user = userService.getByEmail(request.getEmail());
        log.info("user bulundu");

        Application application = applicationConverter.toApplication(request, user);

        Application savedApplication = applicationRepository.save(application);

        GarantiApplicationResponse garantiApplicationResponse = garantiServiceClient.createApplication(prepareGarantiApplicationRequest(user));

        return savedApplication;
    }

    private AkbankApplicationRequest prepareAkbankApplicationRequest(User user) {
        AkbankApplicationRequest applicationRequest = new AkbankApplicationRequest();

        applicationRequest.setUserId(1L);

        return applicationRequest;
    }

    private GarantiApplicationRequest prepareGarantiApplicationRequest(User user) {
        GarantiApplicationRequest applicationRequest = new GarantiApplicationRequest();

        applicationRequest.setUserId(1L);

        return applicationRequest;
    }

    public List<Application> getUserApplications(String email) {
        User user = userService.getByEmail(email);
        return applicationRepository.findByUser(user);
    }
}
