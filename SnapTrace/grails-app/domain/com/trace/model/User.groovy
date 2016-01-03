package com.trace.model

import java.util.Date;

class User {

	String userId
	String password
	String firstName
	String middleName
	String surName
	Date dob
	Date createdDate
	String createdBy
	
    static constraints = {
    }
}
