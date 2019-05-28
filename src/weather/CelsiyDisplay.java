package weather;

public class CelsiyDisplay implements DisplayElement, Observer {
    private Subject weatherData;
    private float heatCelsiy = 0.0f;


    public CelsiyDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(heatCelsiy + " to Celsiy");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        heatCelsiy = transfer(temp);
        display();
    }


    public float transfer(float temperature){
        return  ((5f/9f*(temperature-32f)));
    }
}
