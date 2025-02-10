package org.wf192.webcontent;

public abstract class WFMember {

    String name;
    String homePhoneNumber;
    String mobilePhoneNumber;
    String addr;
    String parentName;
    String parentHomePhoneNumber;
    String parentMobilePhoneNumber;

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getParentHomePhoneNumber() {
        return parentHomePhoneNumber;
    }

    public void setParentHomePhoneNumber(String parentHomePhoneNumber) {
        this.parentHomePhoneNumber = parentHomePhoneNumber;
    }

    public String getParentMobilePhoneNumber() {
        return parentMobilePhoneNumber;
    }

    public void setParentMobilePhoneNumber(String parentMobilePhoneNumber) {
        this.parentMobilePhoneNumber = parentMobilePhoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
