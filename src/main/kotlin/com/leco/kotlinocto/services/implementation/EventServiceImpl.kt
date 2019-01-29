package com.leco.kotlinocto.services.implementation

import com.leco.kotlinocto.converters.EventRequestToDomain
import com.leco.kotlinocto.converters.EventToResponse
import com.leco.kotlinocto.repositories.EventRepository
import com.leco.kotlinocto.resources.request.EventRequest
import com.leco.kotlinocto.resources.response.EventResponse
import com.leco.kotlinocto.services.contracts.EventService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class EventServiceImpl : EventService {

    val eventRepository: EventRepository
    val eventToResponse: EventToResponse
    val eventRequestToDomain: EventRequestToDomain

    @Autowired
    constructor(eventRepository: EventRepository, eventToResponse: EventToResponse, eventRequest: EventRequestToDomain) {
        this.eventRepository = eventRepository
        this.eventToResponse = eventToResponse
        this.eventRequestToDomain = eventRequest
    }


    override fun findByAction(action: String): List<EventResponse?> {
        return eventRepository.findByAction(action).map { event -> this.eventToResponse.convert(event) }
    }

    override fun create(t: EventRequest): EventResponse? {
        return eventToResponse.convert(eventRepository.save(eventRequestToDomain.convert(t)!!))
    }

    override fun delete(id: UUID) {
        eventRepository.deleteById(id)
    }

    override fun findById(id: UUID): EventResponse? {
        return eventToResponse.convert(eventRepository.findById(id).orElse(null))
    }

    override fun findAll(): List<EventResponse?> {
        return eventRepository.findAll().map { event -> this.eventToResponse.convert(event) }
    }
}