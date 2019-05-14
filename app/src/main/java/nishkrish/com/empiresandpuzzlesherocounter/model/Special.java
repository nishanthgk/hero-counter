package nishkrish.com.empiresandpuzzlesherocounter.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

public class Special implements Parcelable {
    public static final Creator<Special> CREATOR = new Creator<Special>() {
        @Override
        public Special createFromParcel(Parcel in) {
            return new Special(in);
        }

        @Override
        public Special[] newArray(int size) {
            return new Special[size];
        }
    };
    private String title;
    private ManaSpeed manaSpeed;
    private String description;
    private Bitmap specialLogo;

    public Special(String title, ManaSpeed manaSpeed, String description, Bitmap specialLogo) {
        this.title = title;
        this.manaSpeed = manaSpeed;
        this.description = description;
        this.specialLogo = specialLogo;
    }

    protected Special(Parcel in) {
        title = in.readString();
        description = in.readString();
        specialLogo = in.readParcelable(Bitmap.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeInt(manaSpeed.getVal());
        parcel.writeString(description);
        parcel.writeParcelable(specialLogo, i);
    }
}
