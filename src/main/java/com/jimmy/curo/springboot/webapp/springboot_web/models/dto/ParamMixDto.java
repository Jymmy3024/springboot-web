package com.jimmy.curo.springboot.webapp.springboot_web.models.dto;

public class ParamMixDto {
    private String message;
    private Integer Code;
    public ParamMixDto(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage (String message){
        this.message = message;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    
}
