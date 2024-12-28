class SecondHandler extends AbstractRequestHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getValue() >= 10 && request.getValue() < 20) {
            System.out.println("Обработчик 2 обработал запрос со значением: " + request.getValue());
        } else {
            System.out.println("Обработчик 2 не может обработать запрос, передает дальше.");
            passToNext(request);
        }
    }
}