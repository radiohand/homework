package additional.computer;

public abstract class Component implements IComponent{

    private boolean isConfigured = false;

    @Override
    public void configComponent() {
        isConfigured = true;
    }

    @Override
    public boolean isConfigured() {
        return isConfigured;
    }
}
