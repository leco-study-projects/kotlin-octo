package com.leco.kotlinocto.converters

import com.leco.kotlinocto.domain.Event
import com.leco.kotlinocto.resources.request.EventRequest
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class EventRequestToDomain : Converter<EventRequest, Event> {

    val issueRequestToDomain: IssueRequestToDomain

    @Autowired
    constructor(issueRequest: IssueRequestToDomain) {
        this.issueRequestToDomain = issueRequest
    }


    override fun convert(source: EventRequest): Event? {
        val event = Event()
        event.action = source.action
        event.issue = issueRequestToDomain.convert(source = source.issueRequest!!)
        event.issue?.event = event
        return event
    }
}