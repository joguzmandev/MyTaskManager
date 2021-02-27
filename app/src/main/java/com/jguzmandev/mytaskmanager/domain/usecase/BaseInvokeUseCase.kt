package com.jguzmandev.mytaskmanager.domain.usecase

interface BaseInvokeUseCase<TParam,TReturn> {

    suspend fun invoke(t:TParam):TReturn
}
