package com.peculiaruc.alc_mmsystem_mentormanager.data.local

import com.peculiaruc.alc_mmsystem_mentormanager.data.repository.ApprovData
import com.peculiaruc.alc_mmsystem_mentormanager.data.repository.EarnData

object EarnedData {
    fun earnCerts():List<EarnData>{
       val earnList = mutableListOf<EarnData>()
        earnList.add(
            EarnData(
                1,
                "Franka Kebede",
                "GADS CLOUD 2022-COMPL...",
            )
        )
        earnList.add(
            EarnData(
                2,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL...."
            )
        )
        earnList.add(
            EarnData(
                3,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL...."
            )
        )
        earnList.add(
            EarnData(
                4,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL....."
            )
        )
        earnList.add(
            EarnData(
                5,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL......"
            )
        )
        earnList.add(
            EarnData(
                6,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL......"
            )
        )
        earnList.add(
            EarnData(
                7,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL......."
            )
        )

        earnList.add(
            EarnData(
                8,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL......."
            )
        )
        earnList.add(
            EarnData(
                9,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL......."
            )
        )
        return earnList
    }
}