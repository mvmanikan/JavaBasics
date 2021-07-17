package com.kavinmaha.service;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Generate {

    private String message;
    private ZonedDateTime timeStamp;

    public Generate(String message, ZonedDateTime timeStamp) {
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(ZonedDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "Generate{" +
                "message='" + message + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Generate generate = (Generate) o;
        return message.equals(generate.message) && timeStamp.equals(generate.timeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, timeStamp);
    }
}
