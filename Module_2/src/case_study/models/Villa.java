package case_study.models;

import case_study.utils.ConstantUtil;

public class Villa extends Facility{
    private ConstantUtil.RoomType roomType;
    private double areaPool;
    private int numberOfFloor;

    public Villa(int id, String code, String name, double areaUsed, double price, int maxPeople, ConstantUtil.RentType rentType, ConstantUtil.RoomType roomType, double areaPool, int numberOfFloor) {
        super(id, code, name, areaUsed, price, maxPeople, rentType);
        this.roomType = roomType;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public ConstantUtil.RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(ConstantUtil.RoomType roomType) {
        this.roomType = roomType;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
