package com.leco.kotlinocto.resources.request

import com.fasterxml.jackson.annotation.JsonProperty

class EventsRequest {
    @JsonProperty("issue")
    var issueRequest: Issue? = null

    @JsonProperty("action")
    var action: String? = null
}
