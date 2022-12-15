package org.example.dto;

public class ItemGoldDto {

    private Integer base;

    private Integer total;

    @Override
    public String toString() {
        return "ItemGoldDto{" + "base=" + getBase() + ", total=" + getTotal() + '}';
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
