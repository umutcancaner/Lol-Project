package org.example;

import org.example.dto.ItemDto;
import org.example.service.ItemService;
import org.example.service.impl.ItemServiceImpl;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ItemService itemService = new ItemServiceImpl();
        final List<ItemDto> expensiveItems = itemService.getExpensiveItems(10);
        expensiveItems.forEach(System.out::println);
    }
}
