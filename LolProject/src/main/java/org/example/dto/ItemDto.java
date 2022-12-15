package org.example.dto;

public class ItemDto {

    private String name;

    private String plaintext;

    private ItemGoldDto gold;

    @Override
    public String toString() {
        return "ItemDto{" + "name='" + getName() + '\'' + ", plaintext='" + getPlaintext() + '\'' + ", gold=" + getGold() + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    public ItemGoldDto getGold() {
        return gold;
    }

    public void setGold(ItemGoldDto gold) {
        this.gold = gold;
    }
}
