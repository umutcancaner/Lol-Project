package org.example.dto;
import java.util.Map;

public class ItemResponseDto {

    private String type;

    private String version;

    private Map<Integer, ItemDto> data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<Integer, ItemDto> getData() {
        return data;
    }

    public void setData(Map<Integer, ItemDto> data) {
        this.data = data;
    }
}
