package com.pppig236.scoutingappredo

import com.github.doyaaaaaken.kotlincsv.dsl.csvReader
import java.io.File

class CSVOperations {

    var teamDataList = ArrayList<String>()

    fun createCsv(fileName: String) {
        val file = File(fileName)

        // create a new file with headers
        // Update this
        file.writeText("Match Number,Alliance,Team Number,Name,Auto Coral L1,Auto Coral L2,Auto Coral L3,Auto Coral L4,Auto Algae Displaced,Auto Algae Processor,Auto Algae Barge,Auto Left,Teleop Coral L1,Teleop Coral L2,Teleop Coral L3,Teleop Coral L4,Teleop Algae Displaced,Teleop Algae Processed,Teleop Algae Barge,Defense,Penalties,Attempt Shallow,Sucess Shallow, Attempt Deep, Success Deep,Parked,Comments,ScoutingType")
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
                column["Match Number"]?.let { teamDataList.add(it) }
                column["Team Number"]?.let { teamDataList.add(it) }
                column["Alliance"]?.let { teamDataList.add(it) }
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