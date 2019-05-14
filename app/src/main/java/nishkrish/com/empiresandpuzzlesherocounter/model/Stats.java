package nishkrish.com.empiresandpuzzlesherocounter.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Stats implements Parcelable {
    public static final Creator<Stats> CREATOR = new Creator<Stats>() {
        @Override
        public Stats createFromParcel(Parcel parcel) {
            return new Stats(parcel);
        }

        @Override
        public Stats[] newArray(int i) {
            return new Stats[i];
        }
    };
    private int power;
    private int attack;
    private int defense;
    private int health;

    public Stats(int power, int attack, int defense, int health) {
        this.power = power;
        this.attack = attack;
        this.defense = defense;
        this.health = health;
    }

    private Stats(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(power);
        parcel.writeInt(attack);
        parcel.writeInt(defense);
        parcel.writeInt(health);
    }
}
