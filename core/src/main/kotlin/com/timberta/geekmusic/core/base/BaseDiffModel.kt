package com.timberta.geekmusic.core.base

interface BaseDiffModel<T> {
    val nameService: T?
    override fun equals(other: Any?): Boolean
}