package com.leco.kotlinocto.converters

import com.leco.kotlinocto.domain.Event
import com.leco.kotlinocto.resources.response.EventResponse
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.core.convert.converter.Converter
import org.springframework.stereotype.Component

@Component
class EventToResponse : Converter<Event, EventResponse> {

    val issueToResponse: IssueToResponse

    @Autowired
    constructor(issueToResponse: IssueToResponse) {
        this.issueToResponse = issueToResponse
    }


    override fun convert(source: Event): EventResponse? {
        val event = EventResponse()
        event.id = source.id.toString()
        event.action = source.action
        event.issue = issueToResponse.convert(source = source.issue!!)
        return event
    }
}