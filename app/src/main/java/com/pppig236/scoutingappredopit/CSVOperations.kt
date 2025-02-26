package com.pppig236.scoutingappredopit

import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import java.io.File

class CSVOperations {

    var teamDataList = ArrayList<String>()

    fun createCsv(fileName: String) {
        val file = File(fileName)

        // create a new file with headers
        // Update this
        file.writeText("Team Number,Drivetrain,Name,Coral L1,Coral L2,Coral L3,Coral L4,Coral HP Pickup, Coral Floor Pickup,Algae Processor,Algae Barge,Algae Displaced,Algae Ground Pickup,Auto Leave,Auto Info,Shallow Cage,Deep Cage, Fit Under Shallow,Best Aspect,Comments,ScoutingType")
    }

    fun appendCsv(fileName: String, text: String) {
        val file = File(fileName)

        file.appendText(text)
    }

    fun readCsv(fileName: String) {
        val file = File(fileName)
        if (file.exists()) {
            val rows: List<Map<String, String>> = csvReader().readAllWithHeader(file)
            for (column in rows) {
                column["Team Number"]?.let { teamDataList.add(it) }
                column["Drivetrain"]?.let { teamDataList.add(it) }
                column["Name"]?.let { teamDataList.add(it) }

            }
        }
    }

    fun deleteCsv(fileName: String) {
        val file = File(fileName)
        if (file.exists()) {
            file.delete()
        }
    }
}