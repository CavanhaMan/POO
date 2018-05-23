package designpattern.state;

class PortaFechada extends PortaState {
    public PortaFechada(Porta porta) { super(porta); }
    public void click() { _porta.setState(new PortaAbrindo(_porta)); }
  }
