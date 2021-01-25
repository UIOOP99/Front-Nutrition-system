package com.example.nutrition_system.model;
import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {
    //string of url
    private String image;
    private String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food(String name, String image , double price) {

        this.name = name;
        this.image = image;
        this.price=price;
    }

    protected Food(Parcel in) {
        name = in.readString();
        image = in.readString();
        price=in.readDouble();
    }

    public static final Creator<Food> CREATOR = new Creator<Food>() {
        @Override
        public Food createFromParcel(Parcel in) {
            return new Food(in);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(image);
        dest.writeDouble(price);
    }
}
