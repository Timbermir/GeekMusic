package com.timberta.geekmusic.core.utils.mapper

interface DataMapper<T, S> {
    fun T.toDomain(): S
}

fun <T : DataMapper<T, S>, S> T.toDomain() = this.toDomain()
