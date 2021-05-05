package com.jcharlesworth

class Receptionist {

// Declaring Variables
	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	int recepPhone
	

    static constraints = {

	
    }
//relationships
static belongsTo = [surgery:Surgery]
static hasMany = []
static hasOne = [] 

}
