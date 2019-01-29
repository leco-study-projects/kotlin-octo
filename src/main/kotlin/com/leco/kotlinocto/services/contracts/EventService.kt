package com.leco.kotlinocto.services.contracts

import com.leco.kotlinocto.resources.request.EventRequest
import com.leco.kotlinocto.resources.response.EventResponse

interface EventService : CrudService<EventRequest, EventResponse> {

    fun findByAction(action: String): List<EventResponse?>
}