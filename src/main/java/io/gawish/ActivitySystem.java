package io.gawish;

public class ActivitySystem implements Observer {
    private static ActivitySystem instance = null;

    private ActivitySystem() {}

    public static ActivitySystem getInstance() {
        if (instance == null) {
            instance = new ActivitySystem();
        }
        return instance;
    }

    @Override
    public void onNotify(String event) {
        if (event.equals("SHAPE_CREATED")) {
            System.out.println("[ACTIVITY] New shape was created");
        } else if (event.equals("GROUP_CREATED")) {
            System.out.println("[ACTIVITY] New group was created");
        } else if (event.equals("SHAPE_SIZE_CHANGED")) {
            System.out.println("[ACTIVITY] Shape size was changed");
        }
    }
}
