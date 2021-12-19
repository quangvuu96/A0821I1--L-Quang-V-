package case_study.models;

import case_study.utils.ConstantUtil;

public abstract class Person {
    private int id;
    private String code;
    private String name;
    private String birthday;
    private ConstantUtil.Gender gender;
    private String phone;
    private String email;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ConstantUtil.Gender getGender() {
        return gender;
    }

    public void setGender(ConstantUtil.Gender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String address;

    public Person(int id, String code, String name, String birthday, ConstantUtil.Gender gender, String phone, String email, String address) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
