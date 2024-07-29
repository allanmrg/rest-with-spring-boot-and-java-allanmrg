package com.allanmrg.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable{

    private static final long serialVersionUID = 1L;

    private Date timestamp;
    private String message;
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details){
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public void setTimestamp(Date timeStamp){
        this.timestamp = timeStamp;
    }

    public Date getTimestamp(){
        return timestamp;
    }

    public void setDetails(String details){
        this.details = details;
    }

    public String getDetails(){
        return details;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
