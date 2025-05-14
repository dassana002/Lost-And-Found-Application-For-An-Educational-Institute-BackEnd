package org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.service;

import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.dto.RequestDTO;

import java.util.List;

public interface RequestService {
    void saveRequest(RequestDTO requestDTO);

    List<RequestDTO> getAll();
}
