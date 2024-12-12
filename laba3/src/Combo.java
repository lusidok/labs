class Combo {
    private String mainDish;
    private String snack;
    private String drink;

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public void setDrink(String topping) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Combo{" +
                "main dish ='" + mainDish + '\'' +
                ",snack ='" + snack + '\'' +
                ", drink ='" + drink + '\'' +
                '}';
    }
}
