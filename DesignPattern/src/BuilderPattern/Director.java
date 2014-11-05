package BuilderPattern;

import java.util.ArrayList;

class Director {
    private ArrayList<String> sequence = new ArrayList<String>();

    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzModel) benzBuilder.getCarModel();
    }

    public BMWModel getABMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) bmwBuilder.getCarModel();
    }

    public BMWModel getBBMWModel() {
        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.bmwBuilder.setSequence(sequence);
        return (BMWModel) bmwBuilder.getCarModel();
    }

}
