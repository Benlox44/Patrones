package StructuralPatterns.Decorator;

public abstract class Decorator implements Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void doWork() {
        if (component != null) {
            component.doWork();
        }
    }
}