package designpatterns.facade.exercise;

public class ComputerFacade {
    BootSystem bs = new BootSystem();
    ComponentsCheck cc = new ComponentsCheck();
    CoolingSystem cs = new CoolingSystem();
    MemoryInit mi = new MemoryInit();


    // true if successful - otherwise false
    public boolean turnOn(){
        if(cc.check()) {
            cs.on();
            mi.init();
            bs.systemBoot();
            return true;
        }
        return false;
    }
}
