package creation.builder;

public class Truck {
    private String owner;
    private String stsNumber;
    private String trailer;

    public Truck(String owner, String stsNumber, String trailer) {
        this.owner = owner;
        this.stsNumber = stsNumber;
        this.trailer = trailer;
    }

    public static TruckBuilder builder() {
        return new TruckBuilder();
    }

    public static class TruckBuilder {
        private String owner;
        private String stsNumber;
        private String trailer;

        public TruckBuilder owner(String owner) {
            this.owner = owner;
            return this;
        }

        public TruckBuilder stsNumber(String stsNumber) {
            this.stsNumber = stsNumber;
            return this;
        }

        public TruckBuilder trailer(String trailer) {
            this.trailer = trailer;
            return this;
        }

        public Truck build() {
            return new Truck(owner, stsNumber, trailer);
        }
    }
}
