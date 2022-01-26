package io.gawish;

public class ActivitySystem {
    private static ActivitySystem instance = null;

    private ActivitySystem() {}

    public static ActivitySystem getInstance() {
        if (instance == null) {
            instance = new ActivitySystem();
        }
        return instance;
    }

    private void printShapeCreatedMessage() {
        System.out.println("[ACTIVITY] New shape was created");
    }

    private void printGroupCreatedMessage() {
        System.out.println("[ACTIVITY] New group was created");
    }

    private void printShapeSizeChangedMessage() {
        System.out.println("[ACTIVITY] Shape size was changed");
    }
}
