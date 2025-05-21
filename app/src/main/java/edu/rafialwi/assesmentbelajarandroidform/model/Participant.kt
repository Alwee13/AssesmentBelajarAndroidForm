package edu.rafialwi.assesmentbelajarandroidform.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Participant(
    val nim: String,
    val nama: String,
    val semester: String,
    val device: String,
    val osDevice: String,
    val namaOSBit: String,
    val ram: String,
    val namaCPU: String,
    val deployment: String,
    val merkHP: String,
    val osHPVersi: String,
    val sizeHP: String,
    val internet: String,
    val android: String,
    val versiAndroid: String
) : Parcelable
