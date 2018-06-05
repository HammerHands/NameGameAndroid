package com.dalemathieu.namegameandroid.network.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class AllProfiles implements Parcelable {
    private List<Profile> people;

    public AllProfiles(List<Profile> people) {
        this.people = people;
    }

    private AllProfiles(Parcel in) {
        this.people = new ArrayList<>();
        in.readList(this.people, Profile.class.getClassLoader());
    }

    public List<Profile> getPeople() {
        return people;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.people);
    }

    public static final Creator<AllProfiles> CREATOR = new Creator<AllProfiles>() {
        @Override
        public AllProfiles createFromParcel(Parcel source) {
            return new AllProfiles(source);
        }

        @Override
        public AllProfiles[] newArray(int size) {
            return new AllProfiles[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }
}
