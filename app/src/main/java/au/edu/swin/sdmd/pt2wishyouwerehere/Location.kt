package au.edu.swin.sdmd.pt2wishyouwerehere

import android.media.Rating
import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Location(val name: String, val city: String, val date:String, val rating:Float) : Parcelable {
}
