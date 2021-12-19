package case_study.models;

import case_study.utils.CommonUtil;
import case_study.utils.ConstantUtil;

public abstract class Facility {
    private int id;
    private String code;
    private String name;
    private double areaUsed;
    private double price;
    private int maxPeople;
    private ConstantUtil.RentType rentType;

    public Facility(int id, String code, String name, double areaUsed, double price, int maxPeople, ConstantUtil.RentType rentType) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.areaUsed = areaUsed;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public ConstantUtil.RentType getRentType() {
        return rentType;
    }

    public void setRentType(ConstantUtil.RentType rentType) {
        this.rentType = rentType;
    }
}
