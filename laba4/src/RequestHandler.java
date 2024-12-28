interface RequestHandler {
    void handleRequest(Request request);
    void setNextHandler(RequestHandler handler);
}

