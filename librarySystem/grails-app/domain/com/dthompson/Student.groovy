package com.dthompson

class Student {

String name

String email

String username

String password

int studentId

Course course

Library locallibrary

    static constraints = {

name blank:false, nullable:false

email blank:false, nullable:false

username blank:false, nullable:false

password blank:false, nullable:false

studentId blank:false, nullable:false

course blank:false, nullable:false

locallibrary blank:false, nullable:false

    }

  static hasMany={bookreviews:BookReview}

}
