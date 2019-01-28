package com.leco.kotlinocto.resources.request

import com.fasterxml.jackson.annotation.JsonProperty

class EventsResponse {
    @JsonProperty("id")
    var id: Int? = null

    @JsonProperty("issue")
    var issue: Issue? = null

    @JsonProperty("action")
    var action: String? = null
}
