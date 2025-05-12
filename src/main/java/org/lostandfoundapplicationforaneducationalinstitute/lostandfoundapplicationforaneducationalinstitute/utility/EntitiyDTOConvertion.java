package org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.utility;

import lombok.RequiredArgsConstructor;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.dto.ItemDTO;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.entity.ItemEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EntitiyDTOConvertion {

    private final ModelMapper modelMapper;

//    Item
    public ItemEntity toItemEntity(ItemDTO itemDTO) {
        return modelMapper.map(itemDTO, ItemEntity.class);
    }

    public ItemDTO toItemDTO(ItemEntity itemEntity) {
        return modelMapper.map(itemEntity, ItemDTO.class);
    }

    public List<ItemDTO> toItemDTOList(List<ItemEntity> itemEntityList) {
        return modelMapper.map(itemEntityList, new TypeToken<List<ItemDTO>>() {}.getType());
    }
}
