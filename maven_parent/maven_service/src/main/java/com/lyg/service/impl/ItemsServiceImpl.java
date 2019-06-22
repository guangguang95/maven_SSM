package com.lyg.service.impl;

import com.lyg.domain.Items;
import com.lyg.mapper.ItemsMapper;
import com.lyg.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public Items findById(Integer id) {
        return itemsMapper.findById(id);
    }
}
