package com.leco.kotlinocto.resources

import com.leco.kotlinocto.repositories.EventService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/event")
class EventResource {

    val eventService: EventService

    @Autowired
    constructor(eventService: EventService) {
        this.eventService = eventService
    }

    @GetMapping("/action/{action}")
    fun findByAction(@PathVariable action: String) = eventService.findByAction(action)
}