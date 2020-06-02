package design.uml.composition;

public class Computer {
	private Mouse mouse = new Mouse();
	private Monitor monitor = new Monitor();
	public void setMouse(Mouse mouse) {
		this.mouse=mouse;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor=monitor;
	}

}
