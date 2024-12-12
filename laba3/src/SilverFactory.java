class SilverFactory implements REFactory {
    @Override
    public Rings createRings(){
        return new SilverRings();
    }

    @Override
    public Earrings createEarrings(){
        return new SilverEarrings();
    }

}
