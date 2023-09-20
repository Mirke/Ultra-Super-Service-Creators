package com.group1.edufy_media.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Throwable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private String field;
    private Object value;

    public ResourceNotFoundException(String name, String field, Object value) {
        super();
        this.name = name;
        this.field = field;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }

    public Object getValue() {
        return value;
    }
}
