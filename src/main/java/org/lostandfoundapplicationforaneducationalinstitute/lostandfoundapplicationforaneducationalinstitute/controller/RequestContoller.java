package org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.controller;

import lombok.RequiredArgsConstructor;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.dto.RequestDTO;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.service.RequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/requests")
@RequiredArgsConstructor
public class RequestContoller {

    private final RequestService requestService;

    @GetMapping("/getAll")
    public ResponseEntity<RequestDTO> getAll() {
        System.out.println("getAll");
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveRequest(@RequestBody RequestDTO requestDTO) {
        requestService.saveRequest(requestDTO);
        return ResponseEntity.ok().build();
    }
}
