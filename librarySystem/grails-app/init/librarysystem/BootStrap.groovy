package com.dthompson

class BootStrap {

def init = { servletContext ->

def course1= new Course( 

title:'BSc Hon',

code:'233',

leader:'John',

department:'IT',

description:'Example Description',

studyMode:'Online').save()

def librarian1= new Librarian( 

name:'Sandra',

email:'sandra@library.com',

office:'23',

username:'sandra34',

password:'imthebest',

telephone:'01234567483',

library:'Maxwell').save() 

def library1= new Library( 

building:'Maxwell',

address:'Green Street',

openingHours:'07:00-18:00',

location:'Sheffield',

studySpaces:'Computer Rooms, Silent Rooms').save()

def book1= new Book( 

title:'Lord of the Rings',

subject:'Fantasy',

author:'J. R. R. Tolkien',

isbn:'2351161',

dateBorrowed:new Date('23/01/2015'),

returnDate:new Date('25/06/2017'),

student:'Allen James',

overdue:'No').save() 

def bookreview1= new BookReview( 

book:'IT',

datecreated:new Date('02/03/2014'),

student:'James Pollon',

review:'Didnt like it').save() 

def student1= new Student( 

name:'Alison Nemesi',

email:'Aneme@uni.org',

username:'ANEME2',

password:'Witness',

studentId:'53',

course:'Networking').save() 

}


    def destroy = {
    }
 
    
}
