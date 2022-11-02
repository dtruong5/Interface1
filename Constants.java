public interface Constants {
        double PI_APPROXIMATION = 3.14D;
        String AREA_UNITS = "sq.cm.";
        String LENGTH_UNIT = "cm.";
        default void defaultMethod(){
            System.out.println("I am a default method");
        }
}
