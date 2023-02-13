package dtos;

import java.util.Arrays;

public class PersonDTO {
    private String company;

    private String lastName;

    private String firstName;

    private String emailAddress;

    private String jobTitle;

    private String businessPhone;

    private String homePhone;

    private String mobilePhone;

    private String faxNumber;

    private String address;

    private String city;

    private String stateProvince;

    private String zipPostalCode;

    private String countryRegion;

    private String webPage;

    private String notes;

    private byte[] attachments;

    private String personsEntity = "PersonsEntity";

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
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

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getZipPostalCode() {
        return zipPostalCode;
    }

    public void setZipPostalCode(String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public byte[] getAttachments() {
        return attachments;
    }

    public void setAttachments(byte[] attachments) {
        this.attachments = attachments;
    }

    public String getPersonsEntity() {
        return personsEntity;
    }

    public void setPersonsEntity(String personsEntity) {
        this.personsEntity = personsEntity;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                ", company='" + company + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", businessPhone='" + businessPhone + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", stateProvince='" + stateProvince + '\'' +
                ", zipPostalCode='" + zipPostalCode + '\'' +
                ", countryRegion='" + countryRegion + '\'' +
                ", webPage='" + webPage + '\'' +
                ", notes='" + notes + '\'' +
                ", attachments=" + Arrays.toString(attachments) +
                ", personsEntity='" + personsEntity + '\'' +
                '}';
    }

}
