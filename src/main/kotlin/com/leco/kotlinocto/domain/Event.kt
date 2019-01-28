package com.leco.kotlinocto.resources.request

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne

@Entity
class Event {

    @Id
    var id: Int? = null

    @OneToOne(mappedBy = "event")
    var issue: Issue? = null

    var action: String? = null
}
