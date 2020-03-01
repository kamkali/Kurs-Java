package designpatterns.facade.theory;

public class EngineFacade {
    double minVolumeOfOil = 2.0;
    OilLevel ol = new OilLevel();
    FuelInjection fi = new FuelInjection();
    EngineFire es = new EngineFire();

    public void engineStart(){
        if ( ol.volumeInLiters() > minVolumeOfOil ){
            fi.on();
            es.on();
            // and other many components
        }
    }
}
