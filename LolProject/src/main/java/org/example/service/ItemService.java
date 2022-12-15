package org.example.service;

import org.example.dto.ItemDto;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<ItemDto> getExpensiveItems(Integer limit);

}
