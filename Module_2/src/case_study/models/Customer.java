package case_study.models;

import case_study.utils.ConstantUtil;

public class Customer extends Person{
    private ConstantUtil.TypeCustomer typeCustomer;

    public Customer(int id, String code, String name, String birthday, ConstantUtil.Gender gender, String phone, String email, String address, ConstantUtil.TypeCustomer typeCustomer) {
        super (id,code,name,birthday,gender,phone,email,address);
        this.typeCustomer = typeCustomer;
    }

    public ConstantUtil.TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(ConstantUtil.TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
}
