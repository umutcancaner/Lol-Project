package org.example.service.impl;

import org.example.dto.ItemDto;
import org.example.dto.impl.ItemRepositoryImpl;
import org.example.repository.ItemRepository;
import org.example.service.ItemService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemServiceImpl  implements ItemService {
    @Override
    public List<ItemDto> getExpensiveItems(Integer limit) {
        Map<Integer, ItemDto> allItems = getItemMap();
        return allItems.values().stream().sorted((o1, o2) -> o2.getGold().getTotal().compareTo(o1.getGold().getTotal())).limit(limit).toList();

    }

    private Map<Integer, ItemDto> getItemMap() {
        ItemRepository itemRepository = new ItemRepositoryImpl();
        Map<Integer, ItemDto> allItems = new HashMap<>();
        try {
            allItems = itemRepository.getAllItems();
        } catch (Exception e) {
            System.out.println("Itemler okunamı ");
            e.printStackTrace();
        }
        return allItems;
    }
}
