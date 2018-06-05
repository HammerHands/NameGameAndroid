package com.dalemathieu.namegameandroid.network.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
    private String name;
    private String pictureUrl;

    public String getName() {
        return name;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    private Person(Parcel in) {
        this.name = in.readString();
        this.pictureUrl = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.pictureUrl);
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel source) {
            return new Person(source);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }
}
