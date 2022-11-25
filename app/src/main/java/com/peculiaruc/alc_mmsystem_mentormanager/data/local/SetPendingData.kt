package com.peculiaruc.alc_mmsystem_mentormanager.data.local

import com.peculiaruc.alc_mmsystem_mentormanager.data.repository.PendData

object SetPendingData {
    fun pendApp(): List<PendData> {
        val pendingList = mutableListOf<PendData>()

        pendingList.add(
            PendData(
                1,
                "Franka Kebede",
                "GADS CLOUD 2022-COMPL...",
            )
        )
        pendingList.add(
            PendData(
                2,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL...",
            )
        )
        return pendingList
    }

}