package com.example.liupf.driverclient2.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by liupf on 2016/11/23.
 * 继承Parcelable 进行序列化，比Serializable效率高一些
 */
public class UserInfo implements Parcelable {

    private String name;
    private String telNumber;

    public UserInfo() {
    }

    protected UserInfo(Parcel in) {
        name=in.readString();
        telNumber=in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(telNumber);
    }

    public static final Creator<UserInfo> CREATOR = new Creator<UserInfo>() {
        @Override
        public UserInfo createFromParcel(Parcel in) {
            return new UserInfo(in);
        }

        @Override
        public UserInfo[] newArray(int size) {
            return new UserInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
