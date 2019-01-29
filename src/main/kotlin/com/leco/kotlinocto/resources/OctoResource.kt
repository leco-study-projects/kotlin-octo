package com.leco.kotlinocto.resources

import com.leco.kotlinocto.resources.request.EventRequest
import com.leco.kotlinocto.services.contracts.EventService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/", produces = ["application/json"])

class OctoResource {

    val eventService: EventService

    @Autowired
    constructor(eventService: EventService) {
        this.eventService = eventService
    }

    @PostMapping(consumes = ["application/json"])
    fun createEvent(@RequestBody event: EventRequest) = eventService.create(event)
}