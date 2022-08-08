package com.timberta.geekmusic.featureMain.data.repositories.base

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingSource
import com.timberta.geekmusic.common.Either
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

internal fun <T> sendNetworkRequest(
    request: suspend () -> T,
) = flow<Either<String, T>> {
    request().also { data ->
        emit(Either.Right(value = data))
    }

}.flowOn(Dispatchers.IO).catch { exception ->
    emit(Either.Left(exception.localizedMessage ?: "An error occurred"))
}


internal fun <Key : Any, Model : Any> sendPagingRequest(
    pagingSource: PagingSource<Key, Model>,
) =
    Pager(
        PagingConfig(
            pageSize = 1,
            prefetchDistance = 1,
            enablePlaceholders = true,
            initialLoadSize = 2,
            maxSize = Int.MAX_VALUE,
            jumpThreshold = Int.MIN_VALUE

        ),
        pagingSourceFactory = {
            pagingSource
        }
    ).flow


