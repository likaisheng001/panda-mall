package com.panda.product.core.effectiveJava;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;


//Immutable class that uses defensive copying
public final class Period implements Serializable{
	
	private Date start;
	private Date end;
	
	public Period(Date start, Date end){
		this.start = start;
		this.end = end;
		
		if(this.start.compareTo(this.end) > 0){
			throw new IllegalArgumentException(start + "after" + end);
		}
	}
	
	private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException{
		s.defaultReadObject();
		
		//给不可变的对象Period设置保护性拷贝
		start = new Date(start.getTime());
		end = new Date(end.getTime());
		
		if (start.compareTo(end) > 0) {
			throw new InvalidObjectException(start + " after " + end);
		}
	}
	
	public Date start(){
		return new Date(start.getTime());
	}
	
	public Date end(){
		return new Date(end.getTime());
	}
	
	public String toString(){
		return start + " - " + end;
	}

}
