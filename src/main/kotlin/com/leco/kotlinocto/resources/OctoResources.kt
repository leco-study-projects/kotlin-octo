package com.leco.kotlinocto.resources

import com.leco.kotlinocto.repositories.EventService
import com.leco.kotlinocto.resources.request.EventRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/", produces = ["application/json"])

class OctoResources {

    val eventService: EventService

    @Autowired
    constructor(eventService: EventService) {
        this.eventService = eventService
    }

    @PostMapping(consumes = ["application/json"])
    fun createEvent(@RequestBody event: EventRequest) = eventService.create(event)
}