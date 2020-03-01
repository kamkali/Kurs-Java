package design.singleton;

public class SettingsSingleton {
    private static SettingsSingleton instance = null;

    int liczba = 10;

    private SettingsSingleton() {
    }

    public static SettingsSingleton getInstance() {
        if (instance == null) {
            instance = new SettingsSingleton();
        }
        return instance;
    }

}
