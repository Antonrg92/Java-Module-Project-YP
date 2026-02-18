public class Race {
    int distance = 0;
    Car theFirstCar;
    public Car returnLeader(Car car) {

        if ((24 * car.speed) > distance) {
            distance = 24 * car.speed;
            theFirstCar = car;
        }
        return theFirstCar;
    }
}

