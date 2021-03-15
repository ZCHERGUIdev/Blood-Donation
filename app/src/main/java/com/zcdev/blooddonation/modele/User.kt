package com.zcdev.blooddonation.modele
import java.io.File
class User {
    var objectId: String? = null
    var fullName: String? = null
    var username: String? = null
    var passWord: String? = null
    var phone: String? = null
    var email: String? = null
    var emailVerified: Boolean? = null
    var photo: File? = null
    var blood: String? = null
    var dis: String? = null
    var age: Int? = null
    constructor(objectId: String?, fullName: String?, username: String?, passWord: String?, phone: String?, email: String?, emailVerified: Boolean?, photo: File?, blood: String?, age: Int?) {
        this.objectId = objectId
        this.fullName = fullName
        this.username = username
        this.passWord = passWord
        this.phone = phone
        this.email = email
        this.emailVerified = emailVerified
        this.photo = photo
        this.blood = blood
        this.age = age
    }
    constructor(objectId: String?, fullName: String?, username: String?, passWord: String?, photo: File?, blood: String?, age: Int?) {
        this.objectId = objectId
        this.fullName=fullName
        this.username = username
        this.passWord = passWord
        this.photo = photo
        this.blood = blood
        this.age = age
    }
    constructor(objectId: String?, fullName: String?, username: String?,blood: String?,distance:String) {
        this.objectId = objectId
        this.fullName=fullName
        this.username=username
        this.blood=blood
        this.dis=distance
    }
    constructor()
}