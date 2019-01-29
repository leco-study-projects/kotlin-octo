package com.leco.kotlinocto.resources.request

import java.util.*
import javax.persistence.*

@Entity
class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID? = null

    @OneToOne(mappedBy = "event", cascade = [CascadeType.ALL])
    var issue: Issue? = null

    var action: String? = null
}
