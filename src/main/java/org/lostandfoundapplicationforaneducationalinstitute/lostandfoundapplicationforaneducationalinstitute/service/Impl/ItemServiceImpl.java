package org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.service.Impl;

import lombok.RequiredArgsConstructor;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.dao.ItemDao;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.dto.ItemDTO;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.entity.ItemEntity;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.service.ItemService;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.utility.EntitiyDTOConvertion;
import org.lostandfoundapplicationforaneducationalinstitute.lostandfoundapplicationforaneducationalinstitute.utility.UtilityData;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemDao itemDao;
    private final EntitiyDTOConvertion convertion;

    @Override
    public void saveItem(ItemDTO itemDTO) {
        itemDTO.setItemId(UtilityData.generateItemId());
        itemDTO.setCreatedDate(UtilityData.generateCurrentDate());

        itemDao.save(convertion.toItemEntity(itemDTO));
    }
}
