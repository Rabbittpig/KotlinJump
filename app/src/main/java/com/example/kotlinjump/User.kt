package com.example.kotlinjump

import android.os.Parcel
import android.os.Parcelable

/**
 * @author zwp
 * @description:
 * @date: 2020/12/23 11:21
 */
class User() : Parcelable{
    var name: String? = "实战:name"
    var age: Int = 100

    constructor(parcel: Parcel) : this() {
        name = parcel.readString()
        age = parcel.readInt()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}