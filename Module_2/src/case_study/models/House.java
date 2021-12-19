package case_study.models;

import case_study.utils.ConstantUtil;

public class House extends Facility{
    private ConstantUtil.RoomType roomType;
    private int numberOfFloor;

    public House(int id, String code, String name, double areaUsed, double price, int maxPeople, ConstantUtil.RentType rentType, ConstantUtil.RoomType roomType, int numberOfFloor) {
        super(id, code, name, areaUsed, price, maxPeople, rentType);
        this.roomType = roomType;
        this.numberOfFloor = numberOfFloor;
    }

    public ConstantUtil.RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(ConstantUtil.RoomType roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
}
