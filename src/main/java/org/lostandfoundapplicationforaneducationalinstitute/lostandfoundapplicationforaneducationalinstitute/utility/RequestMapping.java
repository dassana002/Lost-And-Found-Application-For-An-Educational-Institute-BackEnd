package org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.utility;

import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.dto.ItemDTO;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.dto.RequestDTO;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.dto.UserDTO;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.entity.ItemEntity;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.entity.RequestEntity;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.entity.UserEntity;
import org.modelmapper.TypeToken;

import java.util.List;

public class RequestMapping {

    // Request
    public static RequestEntity toRequestEntity(RequestDTO requestDTO, ItemEntity itemEntity, UserEntity userEntity) {
        RequestEntity requestEntity = new RequestEntity();

        requestEntity.setRequestId(requestDTO.getRequestID());
        requestEntity.setItem(itemEntity);
        requestEntity.setUser(userEntity);
        requestEntity.setStatus(requestDTO.getStatus());
        requestEntity.setRequestDate(requestDTO.getRequestDate());

        return requestEntity;
    }

    public RequestDTO toRequestDTO(RequestEntity requestEntity) {
        return null;
    }

    public List<RequestDTO> toRequestDTOList(List<RequestEntity> requestEntities) {
        return null;
    }
}
