package part6;

public enum Size {
    xxs("xxs", 32) {
        @Override
        public String getDescription(){
            return "Детский размер";
        }
    },
    xs ("xs", 34),
    s ("s", 36),
    m("m", 38),
    l("l", 40);

    public int getEuroSize() {
        return euroSize;
    }

    public String getValue() {
        return value;
    }

    private final String value;
    private final int euroSize;

    Size(String value, int euroSize){
        this.value = value;
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "Взрослый размер";
    }

}
