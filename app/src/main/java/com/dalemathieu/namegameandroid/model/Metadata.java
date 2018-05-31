package com.dalemathieu.namegameandroid.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Metadata implements Parcelable
{
    private final int skip;
    private final int limit;
    private final int total;

    public Metadata(int skip, int limit, int total) {
        this.skip = skip;
        this.limit = limit;
        this.total = total;
    }

    private Metadata(Parcel in) {
        this.skip = in.readInt();
        this.limit = in.readInt();
        this.total = in.readInt();
    }

    public int getSkip() {
        return skip;
    }

    public int getLimit() {
        return limit;
    }

    @Override

}
