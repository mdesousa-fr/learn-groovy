package fr.example

class Message {
    private String message;

    void setMessage(String msg) {
        message = msg;
    }

    String getMessage() {
        return this.message;
    }
    
    static void main(String[] args) {
        Message msg = new Message();
        msg.setMessage("Hello, World!");
        println(msg.getMessage());
    }

    static void msg(final String message) {
        println "[ECHO] ${message}"
    }

}
