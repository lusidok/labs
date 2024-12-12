class ComboDirector {
    private ComboBuilder builder;

    public ComboDirector(ComboBuilder builder) {
        this.builder = builder;
    }

    public void constructCombo() {
        builder.buildMainDish();
        builder.buildSnack();
        builder.buildDrink();
    }
}
