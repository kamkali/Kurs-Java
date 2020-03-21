package com.course.task.flights.models.response;

public abstract class Response {
    protected MessageType type;
    protected String message;

    public enum MessageType {
        INFO, ERROR, WARNING, STATUS
    }

    public Response(MessageType type, String message) {
        this.type = type;
        this.message = message;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
