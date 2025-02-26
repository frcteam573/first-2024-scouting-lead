package com.pppig236.scoutingappredopit

import android.os.Environment
import java.io.File

class Constants {
    val file = Environment.getExternalStorageDirectory().path + "/data_pit.csv"
    val fileClass = File(file)
}