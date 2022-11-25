package com.peculiaruc.alc_mmsystem_mentormanager.data.local

import com.peculiaruc.alc_mmsystem_mentormanager.data.repository.ApprovData

object CertData {
    fun ApprovCert():List<ApprovData>{
        val certificatesList = mutableListOf<ApprovData>()
        certificatesList.add(
            ApprovData(
                1,
                "Franka Kebede",
                "GADS CLOUD 2022-COMPL...",
            )
        )
        certificatesList.add(
            ApprovData(
                2,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL...."
            )
        )
        certificatesList.add(
            ApprovData(
                3,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL...."
            )
        )
        certificatesList.add(
            ApprovData(
                4,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL....."
            )
        )
        certificatesList.add(
            ApprovData(
                5,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL......"
            )
        )
        certificatesList.add(
            ApprovData(
                6,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL......"
            )
        )
        certificatesList.add(
            ApprovData(
                7,
                "Kenneth Uwakwe",
                "GADS CLOUD 2022-COMPL......."
            )
        )
        return certificatesList
    }
}