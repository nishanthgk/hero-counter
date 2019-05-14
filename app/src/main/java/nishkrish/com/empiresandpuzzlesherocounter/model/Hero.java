package nishkrish.com.empiresandpuzzlesherocounter.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Model class to hold Hero information
 */
public class Hero implements Parcelable {
    public static final Creator<Hero> CREATOR = new Creator<Hero>() {
        @Override
        public Hero createFromParcel(Parcel in) {
            return new Hero(in);
        }

        @Override
        public Hero[] newArray(int size) {
            return new Hero[size];
        }
    };
    private String name;
    private String element;
    private String tier;
    private Bitmap profileImage;
    private String family;
    private String type;
    private Stats stats;
    private Special special;

    private Hero(Parcel in) {
        name = in.readString();
        element = in.readString();
        tier = in.readString();
        profileImage = in.readParcelable(Bitmap.class.getClassLoader());
        family = in.readString();
        type = in.readString();
        stats = in.readParcelable(Stats.class.getClassLoader());
        special = in.readParcelable(Special.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(element);
        parcel.writeString(tier);
        parcel.writeParcelable(profileImage, i);
        parcel.writeString(family);
        parcel.writeString(type);
        parcel.writeParcelable(stats, i);
        parcel.writeParcelable(special, i);
    }
}
