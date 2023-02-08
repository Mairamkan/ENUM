public enum Season {
    WINTER("Kysh"), //pablic static void Season WINTER = new Season();
    SPRING("Jaz"),
    SUMMER("Jai"),

    AUTUMN("Kuz");




    private String name;

    Season(String name) {
        this.name = name;
    }
    public void method(){
        System.out.println("Jyl mezgili");
    }



    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                '}';
    }
}
