package com.leco.kotlinocto.controllers

import com.leco.kotlinocto.services.contracts.EventService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller("")
@RequestMapping("/")
class EventController {

    val eventService: EventService

    @Autowired
    constructor(eventService: EventService) {
        this.eventService = eventService
    }

    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("events", eventService.findAll())
        return "index"
    }
}