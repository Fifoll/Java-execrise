public class Prostokat {

    int bokA;
    int bokB;

    public int obliczObwod() {
        return (2* bokA) + (2* bokB);
    }

    public int obliczPole() {
        return bokA*bokB;
    }

    public double obliczPrzekatna() {
        return Math.sqrt(Math.pow(bokA, 2) + Math.pow(bokB, 2));
    }

}

