abstract class ThirdHandler extends AbstractRequestHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getValue() >= 20) {
            System.out.println("Обработчик 3 обработал запрос со значением: " + request.getValue());
        } else {
            System.out.println("Обработчик 3 не может обработать запрос, передает дальше.");
            passToNext(request);
        }
    }
}