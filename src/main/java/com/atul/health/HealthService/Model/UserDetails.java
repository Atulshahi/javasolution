package com.atul.health.HealthService.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="tbl_user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_detail_id")
    private Long userDetailId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "reg_number")
    private String regNumber;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "aadhar_card_no")
    private String aadharCardNo;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_image")
    private String userImage;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "state_id")
    private Long stateId;

    @Column(name = "district_id")
    private Long districtId;

    @Column(name = "taluka_id")
    private Long talukaId;

    @Column(name = "village_id")
    private Long villageId;

    @Column(name = "panchayat_id")
    private Long panchayatId;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "whatsapp_no")
    private String whatsappNo;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "blood_group")
    private String bloodGroup;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "refer_by")
    private String referBy;

    @Column(name = "user_status")
    private Integer userStatus;

    @Column(name = "doctor_speciality")
    private String doctorSpeciality;

    @Column(name = "doctor_degree")
    private String doctorDegree;

    @Column(name = "paytm_no")
    private String paytmNo;

    @Column(name = "hospital_name")
    private String hospitalName;

    public UserDetails(Long userDetailId, Long userId, String regNumber, Long roleId, String aadharCardNo, String firstName, String middleName, String lastName, String userImage, String address, String city, Long stateId, Long districtId, Long talukaId, Long villageId, Long panchayatId, String pincode, String whatsappNo, LocalDate dateOfBirth, Integer age, String gender, String bloodGroup, String occupation, String referBy, Integer userStatus, String doctorSpeciality, String doctorDegree, String paytmNo, String hospitalName) {
        this.userDetailId = userDetailId;
        this.userId = userId;
        this.regNumber = regNumber;
        this.roleId = roleId;
        this.aadharCardNo = aadharCardNo;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.userImage = userImage;
        this.address = address;
        this.city = city;
        this.stateId = stateId;
        this.districtId = districtId;
        this.talukaId = talukaId;
        this.villageId = villageId;
        this.panchayatId = panchayatId;
        this.pincode = pincode;
        this.whatsappNo = whatsappNo;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.occupation = occupation;
        this.referBy = referBy;
        this.userStatus = userStatus;
        this.doctorSpeciality = doctorSpeciality;
        this.doctorDegree = doctorDegree;
        this.paytmNo = paytmNo;
        this.hospitalName = hospitalName;
    }

    public UserDetails() {
    }

    public Long getUserDetailId() {
        return userDetailId;
    }

    public void setUserDetailId(Long userDetailId) {
        this.userDetailId = userDetailId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getAadharCardNo() {
        return aadharCardNo;
    }

    public void setAadharCardNo(String aadharCardNo) {
        this.aadharCardNo = aadharCardNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getTalukaId() {
        return talukaId;
    }

    public void setTalukaId(Long talukaId) {
        this.talukaId = talukaId;
    }

    public Long getVillageId() {
        return villageId;
    }

    public void setVillageId(Long villageId) {
        this.villageId = villageId;
    }

    public Long getPanchayatId() {
        return panchayatId;
    }

    public void setPanchayatId(Long panchayatId) {
        this.panchayatId = panchayatId;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getWhatsappNo() {
        return whatsappNo;
    }

    public void setWhatsappNo(String whatsappNo) {
        this.whatsappNo = whatsappNo;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getReferBy() {
        return referBy;
    }

    public void setReferBy(String referBy) {
        this.referBy = referBy;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public String getDoctorDegree() {
        return doctorDegree;
    }

    public void setDoctorDegree(String doctorDegree) {
        this.doctorDegree = doctorDegree;
    }

    public String getPaytmNo() {
        return paytmNo;
    }

    public void setPaytmNo(String paytmNo) {
        this.paytmNo = paytmNo;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userDetailId=" + userDetailId +
                ", userId=" + userId +
                ", regNumber='" + regNumber + '\'' +
                ", roleId=" + roleId +
                ", aadharCardNo='" + aadharCardNo + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userImage='" + userImage + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", stateId=" + stateId +
                ", districtId=" + districtId +
                ", talukaId=" + talukaId +
                ", villageId=" + villageId +
                ", panchayatId=" + panchayatId +
                ", pincode='" + pincode + '\'' +
                ", whatsappNo='" + whatsappNo + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", occupation='" + occupation + '\'' +
                ", referBy='" + referBy + '\'' +
                ", userStatus=" + userStatus +
                ", doctorSpeciality='" + doctorSpeciality + '\'' +
                ", doctorDegree='" + doctorDegree + '\'' +
                ", paytmNo='" + paytmNo + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                '}';
    }
}
