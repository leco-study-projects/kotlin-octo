package com.leco.kotlinocto.services.contracts

import java.util.*

interface CrudService<T, S> {

    fun create(t: T): S?

    fun delete(id: UUID)

    fun findById(id: UUID): S?

    fun findAll(): List<S?>
}