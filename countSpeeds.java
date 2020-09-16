
class countSpeeds {
    public static void main(String[] args) {
        Spaceship[] obj = new Spaceship[3];
        double avgSpeed = 0;
        String minName = "";
        obj[0] = new Spaceship(888, "Icarus2");
        obj[1] = new Spaceship(123, "LewisAndClark");
        obj[2] = new Spaceship(456, "Serenity");
        int minVal = obj[0].getSpeed();
        for (int i = 0; i < obj.length; i++) {
            int newSpeed = obj[i].getSpeed();
            avgSpeed += newSpeed / obj.length;
            if (newSpeed < minVal) {
                minVal = newSpeed;
                minName = obj[i].getName();
            }
        }
        System.out.println("Average speed is: " + avgSpeed + " and the minimum have " + minName + " with " +minVal);
    }
}

class Spaceship {
    private int speed;
    private String name;
    public Spaceship(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }
    public String getName() {
        return name;
    }
}