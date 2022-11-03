public class MyNumber {

    int x;

    public MyNumber(int x) {
        this.x = x;
    }

    public boolean isOdd() {
        if (x % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEven() {
        if (x % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public double sqrt() {
        return Math.sqrt(x);
    }

    public double pow(int y) {
        return Math.pow(x, y);
    }

    public double add(int y) {
        return x+y;
    }

    public double substract(int y) {
        return x-y;
    }



}
