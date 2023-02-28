package com.rdsistemas.contentcalendar;

import com.rdsistemas.contentcalendar.config.ContentCalendarProperties;
import com.rdsistemas.contentcalendar.model.Content;
import com.rdsistemas.contentcalendar.model.Status;
import com.rdsistemas.contentcalendar.model.Type;
import com.rdsistemas.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Arrays;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(ContentRepository repository) {
//        return args -> {
//            //Insert some data into DB
//            Content content = new Content(null, "Hello Chat GPT", "All about Chat GPT", Status.IDEA, Type.VIDEO, LocalDateTime.now(), null, "");
//            repository.save(content);
//        };
//    }
}
