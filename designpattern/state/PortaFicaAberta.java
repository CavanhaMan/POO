package designpattern.state;

class PortaFicaAberta extends PortaState {
    public PortaFicaAberta(Porta porta) { super(porta); }
    public void click() { _porta.setState(new PortaFechando(_porta)); }
  }
