package com.timberta.geekmusic.coreUI.base

interface BaseDiffModel<T> {
    val nameService: T?
    override fun equals(other: Any?): Boolean
}