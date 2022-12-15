package org.example.dto.impl;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.ItemDto;
import org.example.dto.ItemResponseDto;
import org.example.repository.ItemRepository;

import java.io.File;
import java.io.IOException;
import java.util.Map;



public class ItemRepositoryImpl implements ItemRepository {
    public Map<Integer, ItemDto> getAllItems() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        final ItemResponseDto itemResponseDto = objectMapper.readValue(new File("/home/umtcn/Desktop/LolItem/LolProject/src/main/resources/items.json"), ItemResponseDto.class);
        return itemResponseDto.getData();
    }
    }
