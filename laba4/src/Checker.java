class Checker {
    private CheckingStrategy strategy;
    public void setStrategy(CheckingStrategy strategy) {
        this.strategy = strategy;
    }
    public void checkInfo(String info){
        strategy.check(info);
    }
}
