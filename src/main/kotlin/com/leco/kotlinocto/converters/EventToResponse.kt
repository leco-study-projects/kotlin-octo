package com.leco.kotlinocto.converters

import com.leco.kotlinocto.resources.request.Event
import com.leco.kotlinocto.resources.request.EventRequest
import com.leco.kotlinocto.resources.request.EventsResponse
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class EventToResponse : Converter<Event, EventsResponse> {

    val issueToResponse: IssueToResponse

    @Autowired
    constructor(issueToResponse: IssueToResponse) {
        this.issueToResponse = issueToResponse
    }


    override fun convert(source: Event): EventsResponse? {
        val event = EventsResponse()
        event.id = source.id.toString()
        event.action = source.action
        event.issue = issueToResponse.convert(source = source.issue!!)
        return event
    }
}