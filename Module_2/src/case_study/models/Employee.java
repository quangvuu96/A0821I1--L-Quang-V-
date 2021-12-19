package case_study.models;

import case_study.utils.CommonUtil;
import case_study.utils.ConstantUtil;

public class Employee extends Person implements Comparable<Employee> {
    private ConstantUtil.Degree degree;
    private ConstantUtil.Position position;
    private double salary;

    public Employee(int id, String code, String name, String birthday, ConstantUtil.Gender gender, String phone, String email, String address, ConstantUtil.Degree degree, ConstantUtil.Position position, double salary) {
        super(id, code, name, birthday, gender, phone, email, address);
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public ConstantUtil.Degree getDegree() {
        return degree;
    }

    public void setDegree(ConstantUtil.Degree degree) {
        this.degree = degree;
    }

    public ConstantUtil.Position getPosition() {
        return position;
    }

    public void setPosition(ConstantUtil.Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", code='" + getCode() + '\'' +
                ", fullName='" + getName() + '\'' +
                ", birthday='" + getBirthday() + '\'' +
                ", gender=" + getGender() +
                ", phone='" + getPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", address='" + getAddress() + '\'' +
                "degree=" + degree +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return getId() == ((Employee) obj).getId();
    }
    @Override
    public int compareTo(Employee o) {
        return getName().compareTo(o.getName());
    }
}
