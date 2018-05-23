package designpattern.state;

abstract class PortaState {
    protected Porta _porta;
 
    public PortaState(Porta porta) { _porta = porta; }
 
    public abstract void click();
 
    public void timeout()  { }
    public void complete() { }
 
    public String status() { return getClass().getName(); }
  }
