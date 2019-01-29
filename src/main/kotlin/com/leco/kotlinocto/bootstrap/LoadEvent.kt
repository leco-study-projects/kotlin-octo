package com.leco.kotlinocto.bootstrap

import com.leco.kotlinocto.domain.Event
import com.leco.kotlinocto.domain.Issue
import com.leco.kotlinocto.domain.User
import com.leco.kotlinocto.repositories.EventRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component


@Component
class LoadEvent : CommandLineRunner {

    val eventRepository: EventRepository

    @Autowired
    constructor(eventRepository: EventRepository) {
        this.eventRepository = eventRepository
    }

    override fun run(vararg args: String?) {
        var event = Event()
        event.action = "edited"

        var issue = Issue()
        issue.authorAssociation = "l3co"
        issue.comments = 1
        issue.title = "test create issue"
        issue.number = 1
        issue.state = "open"

        var user = User()
        user.login = "l3co"

        user.issue = issue

        issue.event = event
        issue.user = user

        event.issue = issue

        eventRepository.save(event)
    }
}