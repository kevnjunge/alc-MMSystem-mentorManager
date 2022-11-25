package com.peculiaruc.alc_mmsystem_mentormanager.data.local

import com.peculiaruc.alc_mmsystem_mentormanager.data.repository.CertBenData

object BenefData {
    fun benefApp(): List<CertBenData>{
        val benefList = mutableListOf<CertBenData>()

        benefList.add(
            CertBenData(
                1,
                "Franka Kebede",
                "Program Assistant,Andela,She/her"
            )
        )

        benefList.add(
            CertBenData(
                2,
                "Kenneth Uwakwe",
                "Program Assistant,Andela,She/her",
            )
        )

        benefList.add(
            CertBenData(
                3,
                "Judith Okafor",
                "Program Assistant,Andela,She/her",
            )
        )

        benefList.add(
            CertBenData(
                4,
                "Ayodele Oluwa",
                "Program Assistant,Andela,She/her",
            )
        )

        benefList.add(
            CertBenData(
                5,
                "Jennifer Lopez",
                "Program Assistant,Andela,She/her",
            )
        )

        benefList.add(
            CertBenData(
                6,
                "Ebubechi Orjiakor",
                "Program Assistant,Andela,She/her",
            )
        )

        benefList.add(
            CertBenData(
                7,
                "Kenneth Uwakwe",
                "Program Assistant,Andela,She/her",
            )
        )

        benefList.add(
            CertBenData(
                8,
                "John Doe",
                "Program Assistant,Andela,She/her",
            )
        )
        return benefList
    }

}