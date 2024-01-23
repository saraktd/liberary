package model;

public class Member extends BaysikModel {
public String family;
private Integer age;

    public Member() {
    }

    public Member(String family, Integer age) {
        this.family = family;
        this.age = age;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "family='" + family + '\'' +
                ", age=" + age +
                '}';
    }

    public Object getMemberDitails() {

        return null;
    }
}
