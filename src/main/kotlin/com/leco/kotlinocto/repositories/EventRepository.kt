package com.leco.kotlinocto.repositories

import com.leco.kotlinocto.domain.Event
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface EventRepository : JpaRepository<Event, UUID> {
    fun findByAction(action: String): List<Event>
}