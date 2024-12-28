abstract class AbstractRequestHandler implements RequestHandler {
    protected RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler handler) {
        this.nextHandler = handler;
    }

    // Метод для передачи запроса следующему обработчику
    protected void passToNext(Request request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Конец цепочки, запрос не обработан: " + request.getValue());
        }
    }
}