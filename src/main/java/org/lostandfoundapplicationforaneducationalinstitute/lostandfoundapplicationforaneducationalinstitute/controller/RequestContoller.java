package org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/requests")
public class RequestContoller {

    @GetMapping("/getAll")
    public void testing() {
        System.out.println("getAll");
    }

}
