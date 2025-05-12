package org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute;

import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.entity.ItemEntity;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "package org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.entity")
public class LostAndFoundApplicationForAnEducationalInstituteApplication {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(LostAndFoundApplicationForAnEducationalInstituteApplication.class, args);
    }

}
