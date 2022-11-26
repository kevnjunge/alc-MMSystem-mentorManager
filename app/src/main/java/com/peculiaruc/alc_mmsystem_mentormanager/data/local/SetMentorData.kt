package com.peculiaruc.alc_mmsystem_mentormanager.data.local

import com.peculiaruc.alc_mmsystem_mentormanager.data.repository.MentorData

object SetMentorData {
    fun mentorApp(): List<MentorData>{
        val applicantList = mutableListOf<MentorData>()

        applicantList.add(
            MentorData(
                1,
                "Jeremy Johnson",
                "Program Assistant,Andela,She/her",
            )
        )

        applicantList.add(
            MentorData(
                2,
                "Jane Kebede",
                "Program Assistant,Andela,She/her"
            )
        )
        applicantList.add(
            MentorData(
                3,
                "Roseline Anapuna",
                "Program Assistant,Andela,She/her"
            )
        )

        applicantList.add(
            MentorData(
                4,
                "Rose Ikemefuna",
                "Program Assistant,Andela,She/her"
            )
        )

        applicantList.add(
            MentorData(
                5,
                "Emmanuela Afolayan",
                "Program Assistant,Andela,She/her"
            )
        )
        applicantList.add(
            MentorData(
                6,
                "Peculiar C. Umeh",
                "Program Assistant,Andela,She/her"
            )
        )

        applicantList.add(
            MentorData(
                7,
                "Chidinma Rosebud",
                "Program Assistant,Andela,She/her"
            )
        )
        applicantList.add(
            MentorData(
                8,
                "Peculiar C. Umeh.",
                "Program Assistant,Andela,She/her"
            )
        )

        applicantList.add(
            MentorData(
                9,
                "Peculiar C.Umeh",
                "Program Assistant,Andela,She/her"
            )
        )

        applicantList.add(
            MentorData(
                10,
                "Peculiar Umeh",
                "Program Assistant,Andela,She/her"
            )
        )
        return applicantList

    }
}