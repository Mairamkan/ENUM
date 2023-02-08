public enum Olast {

    YSSYKKOL("Kol"),
    NARYN("Jailoo"),
    JALALABAD("Kurort"),
    OSH("Sulaiman Too"),
    BATKEN("Oruk"),
    CHUI("Bilim"),
    TALAS("Manas Ordo");




    private String ozgocholuktoru;


    Olast(String ozgocholuktoru) {
        this.ozgocholuktoru = ozgocholuktoru;
    }

    @Override
    public String toString() {
        return "Olast{" +
                " ozgocholuktoru ='" + ozgocholuktoru +
                '}';
    }
}

