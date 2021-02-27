package com.jguzmandev.mytaskmanager.utils

import java.util.*

object DateHelpers {

    fun currentDate(): Long = GregorianCalendar.getInstance().time.time

    fun convertLongDateToDate(longDate: Long): Date {
        return Date(longDate)
    }
}

//val hour = SimpleDateFormat("hh:mm:ss")
//val datess = SimpleDateFormat("yyyy-mm-dd")
//hour.format(date)
//datess.format(date)