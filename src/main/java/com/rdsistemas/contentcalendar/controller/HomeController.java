package com.rdsistemas.contentcalendar.controller;

import com.rdsistemas.contentcalendar.config.ContentCalendarProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    @Value("${cc.welcomeMessage: Default welcome message}")
//    private String welcomeMessage;
//
//    @Value("${cc.about}")
//    private String about;

//    @GetMapping("/")
//    public Map<String,String> home(){
//        return Map.of("welcomeMessage", welcomeMessage, "about", about);
//    }

    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/")
    public ContentCalendarProperties home(){
        return properties;
    }
}
