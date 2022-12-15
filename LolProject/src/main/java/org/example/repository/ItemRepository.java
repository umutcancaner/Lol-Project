package org.example.repository;
import java.io.IOException;
import java.util.Map;
import org.example.dto.ItemDto;

public interface ItemRepository {

    Map<Integer, ItemDto> getAllItems() throws IOException;
}
