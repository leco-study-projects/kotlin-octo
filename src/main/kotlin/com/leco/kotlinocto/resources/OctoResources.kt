package com.leco.kotlinocto.resources

import com.leco.kotlinocto.resources.request.Event
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/", produces = ["application/json"])
class OctoResources {

    @PostMapping(consumes = ["application/json"])
    fun createIssue(@RequestBody issues: Event): String {

        println(issues)
        return "{\"message\": \"ok\"}"
    }

    @GetMapping
    fun test(): String {
        return "{\"message\": \"ok\"}"
    }
}