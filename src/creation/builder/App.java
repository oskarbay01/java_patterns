package creation.builder;

public class App {
    public Truck buy() {
        return Truck.builder()
                .owner("Too logictics")
                .stsNumber("123456")
                .trailer("5555")
                .build();
    }
}
