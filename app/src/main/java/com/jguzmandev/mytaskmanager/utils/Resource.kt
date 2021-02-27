package com.jguzmandev.mytaskmanager.utils

import java.lang.Exception

sealed class Resource<T> {
    class Loading<T>():Resource<T>()
    data class Success<T>(val data:T):Resource<T>()
    data class Failure<T>(val exception: Exception):Resource<T>()
}