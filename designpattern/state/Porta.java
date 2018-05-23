package designpattern.state;

class Porta {
    private PortaState _state = new PortaFechada(this);
    protected void setState(PortaState state) { _state = state; }
 
    public void click()    { _state.click();    }
    public void complete() { _state.complete(); }
    public void timeout()  { _state.timeout();  }
 
    public void status() { System.out.println(_state.status()); }
  }
