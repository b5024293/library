package com.dthompson

class BookReview {

Book book

Date datecreated

Student student

String review

    static constraints = {

book blank:false, nullable:false

datecreated blank:false, nullable:false

student blank:false, nullable:false

review blank:false, nullable:false, widget:'textarea'

    }
}
