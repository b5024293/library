package com.dthompson

class Librarian {

String name

String email

String office

String username

String password

String telephone

Library library


    static constraints = {

name blank:false, nullable:false

email blank:false, nullable:false, email:true

office blank:false, nullable:false, maxSize:100

username blank:false, nullable:false, unique:true

password blank:false, nullable:false

telephone blank:false, nullable:false, maxSize:12

library blank:false, nullable:false

    }
}
