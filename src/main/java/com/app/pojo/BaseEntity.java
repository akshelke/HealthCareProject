package com.app.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass

public class BaseEntity {

	      @Id
	      @GeneratedValue(strategy = GenerationType.AUTO)
	    private int Id ;

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}
	      
}
