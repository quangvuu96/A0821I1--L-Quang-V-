package case_study.models;

import case_study.utils.ConstantUtil;

public class Room extends Facility{
    private String serviceApp;

    public Room(int id, String code, String name, double areaUsed, double price, int maxPeople, ConstantUtil.RentType rentType, String serviceApp) {
        super(id, code, name, areaUsed, price, maxPeople, rentType);
        this.serviceApp = serviceApp;
    }

    public String getServiceApp() {
        return serviceApp;
    }

    public void setServiceApp(String serviceApp) {
        this.serviceApp = serviceApp;
    }
}
