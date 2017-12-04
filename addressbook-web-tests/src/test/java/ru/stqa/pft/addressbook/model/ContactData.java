package ru.stqa.pft.addressbook.model;

public class ContactData {

  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String phone_home;
  private final String phone_mobile;
  private final String phone_work;
  private final String fax;
  private final String email;
  private final String email2;
  private final String email3;
  private final String homepage;
  private final String byear;
  private final String ayear;


  public ContactData(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String phone_home, String phone_mobile, String phone_work, String fax, String email, String email2, String email3, String homepage, String byear, String ayear) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.phone_home = phone_home;
    this.phone_mobile = phone_mobile;
    this.phone_work = phone_work;
    this.fax = fax;
    this.email = email;
    this.email2 = email2;
    this.email3 = email3;
    this.homepage = homepage;
    this.byear = byear;
    this.ayear = ayear;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone_home() {
    return phone_home;
  }

  public String getPhone_mobile() {
    return phone_mobile;
  }

  public String getPhone_work() {
    return phone_work;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail() {
    return email;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getHomepage() {
    return homepage;
  }

  public String getByear() {
    return byear;
  }

  public String getAyear() {
    return ayear;
  }
}

