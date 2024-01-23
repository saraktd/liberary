package model;

public class MemberDetails {
    private Long id;
    private Long memberId;
    private String phoneNumber;
    private String addres;

    public MemberDetails() {
    }

    public MemberDetails(Long id, Long memberId, String phoneNumber, String addres) {
        this.id = id;
        this.memberId = memberId;
        this.phoneNumber = phoneNumber;
        this.addres = addres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "MemberDetails{" +
                "id=" + id +
                ", memberId=" + memberId +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", addres='" + addres + '\'' +
                '}';
    }
}
