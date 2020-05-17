package 中介者;

abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl);
}
