package org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.service.Impl;

import lombok.RequiredArgsConstructor;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.dao.RequestDao;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.dto.RequestDTO;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.service.RequestService;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.utility.EntitiyDTOConvertion;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.utility.UtilityData;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RequestServiceImpl implements RequestService {

    private final EntitiyDTOConvertion entityDTOConvertion;
    private final RequestDao requestDao;

    @Override
    public void saveRequest(RequestDTO requestDTO) {
        requestDTO.setRequestID(UtilityData.generateRequestId());
        requestDTO.setRequestDate(UtilityData.generateCurrentDate());

        requestDao.save(entityDTOConvertion.toRequestEntity(requestDTO));
   }
}
