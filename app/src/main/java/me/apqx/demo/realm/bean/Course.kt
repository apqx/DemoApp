package me.apqx.demo.realm.bean

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Course() : RealmObject() {
    var id: Int? = null
    var courseName: String? = null

    constructor(id: Int?, courseName: String?) : this() {
        this.id = id
        this. courseName = courseName
    }

    override fun toString(): String {
        return "id = $id, courseName = $courseName"
    }
}