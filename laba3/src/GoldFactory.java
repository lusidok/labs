class GoldFactory implements REFactory {
    @Override
    public Rings createRings(){
        return new GoldRings();
    }

    @Override
    public Earrings createEarrings(){
        return new GoldEarrings();
    }
}
