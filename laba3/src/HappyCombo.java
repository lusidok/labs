class HappyComboBuilder implements ComboBuilder {
    private Combo combo;

    public HappyComboBuilder() {
        this.combo = new Combo();
    }

    @Override
    public void buildMainDish() {
        combo.setMainDish("Big chicken burger");
    }

    @Override
    public void buildSnack() {
        combo.setSnack("Fries");
    }

    @Override
    public void buildDrink() {
        combo.setDrink("Pepsi");
    }

    @Override
    public Combo getResult() {
        return combo;
    }
}
