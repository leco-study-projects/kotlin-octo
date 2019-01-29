package com.leco.kotlinocto.repositories

import com.leco.kotlinocto.resources.request.Event
import com.leco.kotlinocto.resources.request.EventRequest
import com.leco.kotlinocto.resources.request.EventsResponse
import com.leco.kotlinocto.services.contracts.CrudService
import org.springframework.data.jpa.repository.JpaRepository

interface EventService : CrudService<EventRequest, EventsResponse> {

    fun findByAction(action: String): List<EventsResponse?>
}