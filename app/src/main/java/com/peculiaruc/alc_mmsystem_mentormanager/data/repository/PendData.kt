package com.peculiaruc.alc_mmsystem_mentormanager.data.repository

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PendData(
    val id:Int?,
    val name:String,
    val detail:String
):Parcelable