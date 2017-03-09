package io.github.gefangshuai.model

import java.io.Serializable
import javax.persistence.*

/**
 * Created by gefangshuai on 2017/3/8.
 */
@Entity
@Table(name = "customer")
data class Customer (
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int?,
        var firstName: String?,
        var lastName: String?
        ): Serializable{
//    constructor() : this(null, null, null)  // Spring 需要
}