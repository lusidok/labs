class FirstHandler extends AbstractRequestHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getValue() < 10) {
            System.out.println("Обработчик 1 обработал запрос со значением: " + request.getValue());
        } else {
            System.out.println("Обработчик 1 не может обработать запрос, передает дальше.");
            passToNext(request);
        }
    }
}
