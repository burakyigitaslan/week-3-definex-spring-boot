package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.dto.request.ApplicationRequest;
import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/applications")
@RequiredArgsConstructor
public class ApplicationController {

    private final ApplicationService applicationService;

    @PostMapping("/akbank")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Application> createApplicationForAkbank(@RequestBody ApplicationRequest request) {
        return ResponseEntity.ok().body(applicationService.createApplicationForAkbank(request));
    }

    @PostMapping("/garanti")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Application> createApplicationForGaranti(@RequestBody ApplicationRequest request) {
        return ResponseEntity.ok().body(applicationService.createApplicationForGaranti(request));
    }

    @GetMapping("/user/{email}")
    public ResponseEntity<List<Application>> getUserApplications(@PathVariable String email) {
        List<Application> userApplications = applicationService.getUserApplications(email);
        return ResponseEntity.ok(userApplications);
    }
}
