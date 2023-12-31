public class Tank {
    private int x, y;
    private int dir;
    private int fuel;
    final String modelName = "T34";
    static int counter = 0;
    int number = 0;

    public Tank(){
        this(0, 0, 100);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        number = counter;
        counter++;
    }

    public void goForward(int i) {

        if (Math.abs(i) > fuel) {
            if (i < 0) {
                i = -fuel;
            } else {
                i = fuel;
            }
        }
        fuel -= Math.abs(i);

        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
    }

    public void printPosition() {
        System.out.printf("The Tank %s-%d is at %d, %d now.\n", modelName, number, x, y);
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
