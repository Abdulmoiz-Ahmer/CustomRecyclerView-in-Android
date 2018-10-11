package com.example.aceahmer.taskfour;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelClass implements Parcelable {
    String MovieName;
    int id;

    public ModelClass(String movieName, int id, String year, String review) {
        MovieName = movieName;
        this.id = id;
        Year = year;
        Review = review;
    }

    protected ModelClass(Parcel in) {
        MovieName = in.readString();
        id = in.readInt();
        Year = in.readString();
        Review = in.readString();
    }

    public static final Creator<ModelClass> CREATOR = new Creator<ModelClass>() {
        @Override
        public ModelClass createFromParcel(Parcel in) {
            return new ModelClass(in);
        }

        @Override
        public ModelClass[] newArray(int size) {
            return new ModelClass[size];
        }
    };

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getReview() {
        return Review;
    }

    public void setReview(String review) {
        Review = review;
    }

    String Year;
    String Review;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(MovieName);
        parcel.writeInt(id);
        parcel.writeString(Year);
        parcel.writeString(Review);
    }
}
