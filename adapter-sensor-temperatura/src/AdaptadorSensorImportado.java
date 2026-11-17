public class AdaptadorSensorImportado implements SensorTemperatura {
private SensorImportado sensor;


public AdaptadorSensorImportado(SensorImportado var1) {
this.sensor = var1;
}

public String getNombre(){
return this.sensor.getModelo();
}

public double leerCelsius(){
return (sensor.readFahrenheit() - 32.) * 5 / 9;
}
}